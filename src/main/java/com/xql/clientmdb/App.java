package com.xql.clientmdb;

// pgseliso@gmail.com
// husnifahmi@outlook.com
// 2023-08-05

public class App {
    public static void main(String[] args) {
        String baseUrl = "http://localhost:8080";
        // String baseUrl = "http://api001.multidb.net:8080";

        // List of virtual schemas
        String url = baseUrl + "/api/v1/schemas";
        ListSchemas listSchemas = new ListSchemas();
        listSchemas.setUrl(url);
        listSchemas.getSchemas();
        System.out.println();

        // List of database sources
        url = baseUrl + "/api/v1/dbconns";
        ListDbconns listDbconns = new ListDbconns();
        listDbconns.setUrl(url);
        listDbconns.getDbconns();
        System.out.println();

        // Cannot remove dbconn which is still being used by schemas
        // Remove schemas first before removing dbconns
        GetDbconnDetail getDbconnDetail = new GetDbconnDetail();
        getDbconnDetail.setBaseUrl(baseUrl);

        // incorrect input
        // 1. get detail information of database source: null string
        System.out.println("1. get detail information of database source: null string");
        url = baseUrl + "/api/v1/dbconns/";
        getDbconnDetail.setUrl(url);
        getDbconnDetail.setDbconn(null);

        getDbconnDetail.getDbconnDetail();
        System.out.println();

        // incorrect input
        // 2. get detail information of database source: empty string
        System.out.println("2. get detail information of database source: empty string");
        url = baseUrl + "/api/v1/dbconns/";
        getDbconnDetail.setUrl(url);
        getDbconnDetail.setDbconn("");

        getDbconnDetail.getDbconnDetail();
        System.out.println();

        // incorrect input
        // 3. get detail information of database source: blank string
        System.out.println("3. get detail information of database source: blank string");
        url = baseUrl + "/api/v1/dbconns/";
        getDbconnDetail.setUrl(url);
        getDbconnDetail.setDbconn("     ");

        getDbconnDetail.getDbconnDetail();
        System.out.println();

        // incorrect input
        // 4. get detail information of database source: contains space
        System.out.println("4. get detail information of database source: contains space");
        url = baseUrl + "/api/v1/dbconns/";
        getDbconnDetail.setUrl(url);
        getDbconnDetail.setDbconn("psql_ northwind");

        getDbconnDetail.getDbconnDetail();
        System.out.println();

        // incorrect input
        // 5. get detail information of database source: contains space
        System.out.println("4. get detail information of database source: contains #");
        url = baseUrl + "/api/v1/dbconns/";
        getDbconnDetail.setUrl(url);
        getDbconnDetail.setDbconn("psql_n#orthwind");

        getDbconnDetail.getDbconnDetail();
        System.out.println();

        // correct input
        // 6. get detail information of database source: psql_northwind
        System.out.println("6. get detail information of database source: psql_northwind");
        url = baseUrl + "/api/v1/dbconns/";
        getDbconnDetail.setUrl(url);
        getDbconnDetail.setDbconn("psql_northwind");

        getDbconnDetail.getDbconnDetail();
        System.out.println();

        // correct input
        // 7. get detail information of database source: mysql_northwind
        System.out.println("7. get detail information of database source: mysql_northwind");
        url = baseUrl + "/api/v1/dbconns/";
        getDbconnDetail.setUrl(url);
        getDbconnDetail.setDbconn("mysql_northwind");

        getDbconnDetail.getDbconnDetail();
        System.out.println();

        // correct input
        // 8. get detail information of database source: csv_northwind
        System.out.println("8. get detail information of database source: csv_northwind");
        url = baseUrl + "/api/v1/dbconns/";
        getDbconnDetail.setUrl(url);
        getDbconnDetail.setDbconn("csv_northwind");

        getDbconnDetail.getDbconnDetail();
        System.out.println();

        // correct input
        // 9. get detail information of database source: ora_northwind
        System.out.println("9. get detail information of database source: ora_northwind");
        url = baseUrl + "/api/v1/dbconns/";
        getDbconnDetail.setUrl(url);
        getDbconnDetail.setDbconn("ora_northwind");

        getDbconnDetail.getDbconnDetail();
        System.out.println();

        // correct input
        // 10. get detail information of database source: msq_northwind
        System.out.println("10. get detail information of database source: msq_northwind");
        url = baseUrl + "/api/v1/dbconns/";
        getDbconnDetail.setUrl(url);
        getDbconnDetail.setDbconn("msq_northwind");

        getDbconnDetail.getDbconnDetail();
        System.out.println();

    }
}
