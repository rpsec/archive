package groovy

import groovy.sql.Sql


/**
 * Created by IntelliJ IDEA.
 * User: ryanp
 * Date: 1/11/13
 * Time: 3:52 PM
 * To change this template use File | Settings | File Templates.
 */
class db {

    def main() {
        def sql = Sql.newInstance("jdbc:mysql://localhost:3306/test", "root", "", "com.mysql.jdbc.Driver")
//        println sql.execute("select * from test.test")

//        def people = sql.dataSet("test")
//        people.add(test:"WHATEVER")

        sql.eachRow("select * from test") { println it}
    }
}
