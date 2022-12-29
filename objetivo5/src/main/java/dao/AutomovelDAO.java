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

    public static Automovel selectAutomovelById(int id) {
        final String sql = "SELECT * FROM automovel WHERE id=?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setInt(1, id);
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
            pstmt.setString(1, placa.toLowerCase() + "%");
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
            pstmt.setString(1, cor.toLowerCase() + "%");
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
        final String sql = "INSERT INTO automovel (placa, cor, nr_portas, tipo_combustivel, quilometragem,renavam,chassi,valor_locacao) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
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
            int count = pstmt.executeUpdate();
            return count > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean updateAutomovel(Automovel automovel) {
        final String sql = "UPDATE automovel SET placa=?, cor=?, nr_portas=?, tipo_combustivel=?, quilometragem=?, renavam=?, chassi=?, valor_locacao=?";
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
            int count = pstmt.executeUpdate();
            return count > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean DeleteAutomovel(int id) {
        final String sql = "delete from automovel WHERE id=?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setInt(1, id);
            int count = pstmt.executeUpdate();
            return count > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // método utilitário, converte ResultSet na classe de modelo (nesse caso, Cliente)
    private static Automovel resultsetToAutomovel(ResultSet rs) throws SQLException {
        Automovel a = new Automovel();
        a.setPlaca(rs.getString("placa"));
        a.setCor(rs.getString("cor"));
        a.setNrportas(rs.getInt("nr_portas"));
        a.setTipo_combustivel(rs.getInt("tipo_combustivel"));
        a.setQuilometragem(rs.getLong("quilometragem"));
        a.setRenavan(rs.getLong("renavam"));
        a.setChassi(rs.getString("chassi"));
        a.setValor_locacao(rs.getDouble("valor_locacao"));

        return a;
    }

    public static void main(String[] args) {
        //System.out.println("\nLista de Clientes");
        //System.out.println(ClienteDAO.selectClientes());

        //System.out.println("\nCliente pelo id");
        //System.out.println(ClienteDAO.selectClienteById(1L));

        //System.out.println("\nClientes pelo nome");
        //System.out.println(ClienteDAO.selectClientesByName("a"));

        //System.out.println("\nCliente pela situação");
        //System.out.println(ClienteDAO.selectClientesBySituacao(true));

        System.out.println("\nCriando um automovel");
    Automovel automovel = new Automovel("abc","vermelho", 2, 1, 1234, 123, "abcde", 2500.22);
        System.out.println(AutomovelDAO.insertAutomovel(automovel));
        System.out.println("\nCliente INSERIDO na base de dados: " + AutomovelDAO.selectAutomovelById(1));

        //System.out.println("\nAlterando um cliente (o criado recentemente)");
        //cliente = selectClienteById(3L);
        //cliente.setNome("Aline Marisa");
        //cliente.setSobrenome("Vaz");
        //System.out.println(ClienteDAO.updateCliente(cliente));
        //System.out.println("\nCliente ALTERADO na base de dados: " + ClienteDAO.selectClienteById(3L));

        //System.out.println("\nDeletando um cliente (o criado recentemente)");
        //System.out.println(softDeleteCliente(3, false));
        //System.out.println("\nCliente EXCLUÍDO na base de dados: " + ClienteDAO.selectClienteById(3L));
    }

}
