package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Automovel;

public class AutomovelDAO extends BaseDAO {
    public static List<Automovel> selectAutomovel() {
        final String sql = "SELECT * FROM automovel ORDER BY codautomovel";
        try // try-with-resource
                (
                        Connection conn = getConnection();
                        PreparedStatement pstmt = conn.prepareStatement(sql);
                        ResultSet rs = pstmt.executeQuery();
                )
        {
            List<Automovel> automovelList = new ArrayList<>();
            while (rs.next()) {
                automovelList.add(resultsetToAutomovel(rs));
            }
            return automovelList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Automovel selectAutomovelByCodAutomovel(int cod) {
        final String sql = "SELECT * FROM automovel WHERE codautomovel=?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setInt(1, cod);
            ResultSet rs = pstmt.executeQuery();
            Automovel automovel = null;
            if (rs.next()) {
                automovel = resultsetToAutomovel(rs);
            }
            rs.close();
            return automovel;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static List<Automovel> selectAutomovelByPlaca(String placa) {
        final String sql = "SELECT * FROM automovel WHERE placa LIKE ? ORDER BY placa";
        try // try-with-resource
                (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, "%" + placa.toLowerCase() + "%");
            ResultSet rs = pstmt.executeQuery();
            List<Automovel> automovelList = new ArrayList<>();
            while (rs.next()) {
                automovelList.add(resultsetToAutomovel(rs));
            }
            return automovelList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<Automovel> selectAutomovelByCor(String cor) {
        final String sql = "SELECT * FROM automovel WHERE cor LIKE ? ";
        try // try-with-resource
                (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, "%" + cor.toLowerCase() + "%");
            ResultSet rs = pstmt.executeQuery();
            List<Automovel> automovelList = new ArrayList<>();
            while (rs.next()) {
                automovelList.add(resultsetToAutomovel(rs));
            }
            return automovelList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<Automovel> selectAutomovelByTipo_Combustivel(int combustivel) {
        final String sql = "SELECT * FROM automovel WHERE tipo_combustivel=?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setInt(1, combustivel);
            ResultSet rs = pstmt.executeQuery();
            List<Automovel> automovelList = new ArrayList<>();
            while (rs.next()) {
                automovelList.add(resultsetToAutomovel(rs));
            }
            return automovelList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<Automovel> selectAutomovelByNr_Portas(int portas) {
        final String sql = "SELECT * FROM automovel WHERE nr_portas=?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setInt(1, portas);
            ResultSet rs = pstmt.executeQuery();
            List<Automovel> automovelList = new ArrayList<>();
            while (rs.next()) {
                automovelList.add(resultsetToAutomovel(rs));
            }
            return automovelList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


    public static List<Automovel> selectAutomovelByValor_Locacao(double valor) {
        final String sql = "SELECT * FROM automovel WHERE valor_locacao<=?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setDouble(1, valor);
            ResultSet rs = pstmt.executeQuery();
            List<Automovel> automovelList = new ArrayList<>();
            while (rs.next()) {
                automovelList.add(resultsetToAutomovel(rs));
            }
            return automovelList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


    public static boolean insertAutomovel(Automovel automovel) {
        final String sql = "INSERT INTO automovel (placa, cor, nr_portas, tipo_combustivel, quilometragem,renavam,chassi,valor_locacao,codmodelo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
        )
        {
            pstmt.setString(1, automovel.getPlaca());
            pstmt.setString(2, automovel.getCor());
            pstmt.setInt(3, automovel.getNrportas());
            pstmt.setInt(4, automovel.getTipo_combustivel());
            pstmt.setLong(5, automovel.getQuilometragem());
            pstmt.setLong(6, automovel.getRenavan());
            pstmt.setString(7, automovel.getChassi());
            pstmt.setDouble(8, automovel.getValor_locacao());
            pstmt.setInt(9, automovel.getCodmodelo());
            int count = pstmt.executeUpdate();
            return count > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean updateAutomovel(Automovel automovel, int cod) {
        final String sql = "UPDATE automovel SET placa=?, cor=?, nr_portas=?, tipo_combustivel=?, quilometragem=?, renavam=?, chassi=?, valor_locacao=?,codmodelo=? where codautomovel=?";
        try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
        )
        {
            pstmt.setString(1, automovel.getPlaca());
            pstmt.setString(2, automovel.getCor());
            pstmt.setInt(3, automovel.getNrportas());
            pstmt.setInt(4, automovel.getTipo_combustivel());
            pstmt.setLong(5, automovel.getQuilometragem());
            pstmt.setLong(6, automovel.getRenavan());
            pstmt.setString(7, automovel.getChassi());
            pstmt.setDouble(8, automovel.getValor_locacao());
            pstmt.setInt(9, automovel.getCodmodelo());
            pstmt.setInt(10, cod);
            int count = pstmt.executeUpdate();
            return count > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean DeleteAutomovel(int cod) {
        final String sql = "delete from automovel WHERE codautomovel=?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setInt(1, cod);
            int count = pstmt.executeUpdate();
            return count > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // método utilitário, converte ResultSet na classe de modelo
    private static Automovel resultsetToAutomovel(ResultSet rs) throws SQLException {
        Automovel a = new Automovel();
        a.setCodautomovel(rs.getInt("codautomovel"));
        a.setPlaca(rs.getString("placa"));
        a.setCor(rs.getString("cor"));
        a.setNrportas(rs.getInt("nr_portas"));
        a.setTipo_combustivel(rs.getInt("tipo_combustivel"));
        a.setQuilometragem(rs.getLong("quilometragem"));
        a.setRenavan(rs.getLong("renavam"));
        a.setChassi(rs.getString("chassi"));
        a.setValor_locacao(rs.getDouble("valor_locacao"));
        a.setCodmodelo(rs.getInt("codmodelo"));

        return a;
    }

    public static void main(String[] args) {

        //Testes

        //select
        System.out.println("\n automoveis no banco" + AutomovelDAO.selectAutomovel());

        //select por codautomovel
        //System.out.println(selectAutomovelByCodAutomovel(3));

        //select por placa
        //System.out.println(selectAutomovelByPlaca("c"));

        //select por cor
        //System.out.println(selectAutomovelByCor("vermelho"));

        //select por tipo de combustivel
        //System.out.println(selectAutomovelByTipo_Combustivel(1));

        //select por numero de portas
        //System.out.println(selectAutomovelByNr_Portas(2));

        //select por valor de locação
        //System.out.println(selectAutomovelByValor_Locacao(4000.00));

        //insert
        //Automovel automovel = new Automovel("abc","vermelho", 2, 1, 4321, 321, "edcba", 3000.00,1);
        //System.out.println(AutomovelDAO.insertAutomovel(automovel));
        //System.out.println("\nAutomovel criado: " + AutomovelDAO.selectAutomovelByCodAutomovel(5));

        //update
        //Automovel automovel = new Automovel("cab","verde", 2, 2, 654321, 123456534, "naosei", 4000.00,1);
        //updateAutomovel(automovel,4);
        //System.out.println("\nAutomovel atualizado: " + AutomovelDAO.selectAutomovelByCodAutomovel(4));

        //Delete
        //DeleteAutomovel(5);
        //System.out.println("\nAutomovel deletado: " + AutomovelDAO.selectAutomovelByCodAutomovel(5));

    }


}
