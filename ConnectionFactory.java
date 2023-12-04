public class ConnectionFactory {

    public Connection recuperarConexao() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/byte_bank?user=root&password=_Fb86^R-7g27");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
