// Autogenerated by convert_tests.py and process_polyglot.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../templates/Test.java
package gen;

import com.rethinkdb.RethinkDB;
import com.rethinkdb.gen.exc.*;
import com.rethinkdb.gen.ast.*;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.model.MapObject;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.net.Connection;
import com.rethinkdb.net.Cursor;
import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.*;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.Instant;
import java.util.stream.LongStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import java.util.Collections;
import java.nio.charset.StandardCharsets;

import static gen.TestingCommon.*;
import gen.TestingFramework;

public class TimesConstructors {
    Logger logger = LoggerFactory.getLogger(TimesConstructors.class);
    public static final RethinkDB r = RethinkDB.r;

    Connection<?> conn;
    public String hostname = TestingFramework.getConfig().getHostName();
    public int port = TestingFramework.getConfig().getPort();

    @Before
    public void setUp() throws Exception {
        conn = TestingFramework.createConnection();
        try {
            r.dbCreate("test").run(conn);
            r.db("test").wait_().run(conn);
        }catch (Exception e){}
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Tearing down.");
        if(!conn.isOpen()){
            conn.close();
            conn = TestingFramework.createConnection();
        }
        r.dbDrop("test").run(conn);
        r.db("rethinkdb").table("_debug_scratch").delete();
        conn.close(false);
    }

    // Autogenerated tests below

        @Test(timeout=120000)
    public void test() throws Exception {
                
        {
            // times/constructors.yaml #1
            /* datetime.fromtimestamp(896571240, r.ast.RqlTzinfo('00:00')) */
            OffsetDateTime expected_ = datetime.fromtimestamp(896571240L, ast.rqlTzinfo("00:00"));
            /* r.expr(r.epoch_time(896571240)) */
            System.out.println("About to run #1: r.expr(r.epochTime(896571240L))");
            Object obtained = runOrCatch(r.expr(r.epochTime(896571240L)),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #1");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #1");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #1:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // times/constructors.yaml #2
            /* ({'stuff':datetime.fromtimestamp(896571240, r.ast.RqlTzinfo('00:00')), 'more':[datetime.fromtimestamp(996571240, r.ast.RqlTzinfo('00:00'))]}) */
            Map expected_ = r.hashMap("stuff", datetime.fromtimestamp(896571240L, ast.rqlTzinfo("00:00"))).with("more", r.array(datetime.fromtimestamp(996571240L, ast.rqlTzinfo("00:00"))));
            /* r.expr({'stuff':r.epoch_time(896571240), 'more':[r.epoch_time(996571240)]}) */
            System.out.println("About to run #2: r.expr(r.hashMap('stuff', r.epochTime(896571240L)).with('more', r.array(r.epochTime(996571240L))))");
            Object obtained = runOrCatch(r.expr(r.hashMap("stuff", r.epochTime(896571240L)).with("more", r.array(r.epochTime(996571240L)))),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #2");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #2");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #2:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // times/constructors.yaml #3
            /* ([datetime.fromtimestamp(796571240, r.ast.RqlTzinfo('00:00')), datetime.fromtimestamp(896571240, r.ast.RqlTzinfo('00:00')), {'stuff':datetime.fromtimestamp(996571240, r.ast.RqlTzinfo('00:00'))}]) */
            List expected_ = r.array(datetime.fromtimestamp(796571240L, ast.rqlTzinfo("00:00")), datetime.fromtimestamp(896571240L, ast.rqlTzinfo("00:00")), r.hashMap("stuff", datetime.fromtimestamp(996571240L, ast.rqlTzinfo("00:00"))));
            /* r.expr([r.epoch_time(796571240), r.epoch_time(896571240), {'stuff':r.epoch_time(996571240)}]) */
            System.out.println("About to run #3: r.expr(r.array(r.epochTime(796571240L), r.epochTime(896571240L), r.hashMap('stuff', r.epochTime(996571240L))))");
            Object obtained = runOrCatch(r.expr(r.array(r.epochTime(796571240L), r.epochTime(896571240L), r.hashMap("stuff", r.epochTime(996571240L)))),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #3");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #3");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #3:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // times/constructors.yaml #4
            /* ({'nested':{'time':datetime.fromtimestamp(896571240, r.ast.RqlTzinfo('00:00'))}}) */
            Map expected_ = r.hashMap("nested", r.hashMap("time", datetime.fromtimestamp(896571240L, ast.rqlTzinfo("00:00"))));
            /* r.expr({'nested':{'time':r.epoch_time(896571240)}}) */
            System.out.println("About to run #4: r.expr(r.hashMap('nested', r.hashMap('time', r.epochTime(896571240L))))");
            Object obtained = runOrCatch(r.expr(r.hashMap("nested", r.hashMap("time", r.epochTime(896571240L)))),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #4");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #4");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #4:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // times/constructors.yaml #5
            /* ([1, "two", ["a", datetime.fromtimestamp(896571240, r.ast.RqlTzinfo('00:00')), 3]]) */
            List expected_ = r.array(1L, "two", r.array("a", datetime.fromtimestamp(896571240L, ast.rqlTzinfo("00:00")), 3L));
            /* r.expr([1, "two", ["a", r.epoch_time(896571240), 3]]) */
            System.out.println("About to run #5: r.expr(r.array(1L, 'two', r.array('a', r.epochTime(896571240L), 3L)))");
            Object obtained = runOrCatch(r.expr(r.array(1L, "two", r.array("a", r.epochTime(896571240L), 3L))),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #5");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #5");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #5:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // times/constructors.yaml #6
            /* 1 */
            Long expected_ = 1L;
            /* r.epoch_time(1).to_epoch_time() */
            System.out.println("About to run #6: r.epochTime(1L).toEpochTime()");
            Object obtained = runOrCatch(r.epochTime(1L).toEpochTime(),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #6");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #6");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #6:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // times/constructors.yaml #7
            /* -1 */
            Long expected_ = -1L;
            /* r.epoch_time(-1).to_epoch_time() */
            System.out.println("About to run #7: r.epochTime(-1L).toEpochTime()");
            Object obtained = runOrCatch(r.epochTime(-1L).toEpochTime(),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #7");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #7");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #7:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // times/constructors.yaml #8
            /* (1.444) */
            Double expected_ = 1.444;
            /* r.epoch_time(1.4444445).to_epoch_time() */
            System.out.println("About to run #8: r.epochTime(1.4444445).toEpochTime()");
            Object obtained = runOrCatch(r.epochTime(1.4444445).toEpochTime(),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #8");
            try {
                assertEquals((double) expected_,
                             ((Number) obtained).doubleValue(),
                             0.00000000001);
            System.out.println("Finished asserting #8");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #8:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // times/constructors.yaml #9
            /* ("1970-01-01T00:00:01.444+00:00") */
            String expected_ = "1970-01-01T00:00:01.444+00:00";
            /* r.epoch_time(1.4444445).to_iso8601() */
            System.out.println("About to run #9: r.epochTime(1.4444445).toIso8601()");
            Object obtained = runOrCatch(r.epochTime(1.4444445).toIso8601(),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #9");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #9");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #9:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // times/constructors.yaml #10
            /* (1.444          ) */
            Double expected_ = 1.444;
            /* r.epoch_time(1.4444445).seconds() */
            System.out.println("About to run #10: r.epochTime(1.4444445).seconds()");
            Object obtained = runOrCatch(r.epochTime(1.4444445).seconds(),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #10");
            try {
                assertEquals((double) expected_,
                             ((Number) obtained).doubleValue(),
                             0.00000000001);
            System.out.println("Finished asserting #10");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #10:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // times/constructors.yaml #11
            /* (10000) */
            Long expected_ = 10000L;
            /* r.epoch_time(253430000000).year() */
            System.out.println("About to run #11: r.epochTime(253430000000L).year()");
            Object obtained = runOrCatch(r.epochTime(253430000000L).year(),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #11");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #11");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #11:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // times/constructors.yaml #12
            /* err("ReqlQueryLogicError", "Year `10000` out of valid ISO 8601 range [0, 9999].", []) */
            Err expected_ = err("ReqlQueryLogicError", "Year `10000` out of valid ISO 8601 range [0, 9999].", r.array());
            /* r.epoch_time(253430000000).to_iso8601() */
            System.out.println("About to run #12: r.epochTime(253430000000L).toIso8601()");
            Object obtained = runOrCatch(r.epochTime(253430000000L).toIso8601(),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #12");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #12");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #12:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // times/constructors.yaml #13
            /* err("ReqlQueryLogicError", "Error in time logic: Year is out of valid range: 1400..10000.", []) */
            Err expected_ = err("ReqlQueryLogicError", "Error in time logic: Year is out of valid range: 1400..10000.", r.array());
            /* r.epoch_time(253440000000).year() */
            System.out.println("About to run #13: r.epochTime(253440000000L).year()");
            Object obtained = runOrCatch(r.epochTime(253440000000L).year(),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #13");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #13");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #13:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // times/constructors.yaml #14
            /* (253440000000) */
            Long expected_ = 253440000000L;
            /* r.epoch_time(253440000000).to_epoch_time() */
            System.out.println("About to run #14: r.epochTime(253440000000L).toEpochTime()");
            Object obtained = runOrCatch(r.epochTime(253440000000L).toEpochTime(),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #14");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #14");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #14:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // times/constructors.yaml #15
            /* (1400) */
            Long expected_ = 1400L;
            /* r.epoch_time(-17980000000).year() */
            System.out.println("About to run #15: r.epochTime(-17980000000L).year()");
            Object obtained = runOrCatch(r.epochTime(-17980000000L).year(),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #15");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #15");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #15:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // times/constructors.yaml #16
            /* err("ReqlQueryLogicError", "Error in time logic: Year is out of valid range: 1400..10000.", []) */
            Err expected_ = err("ReqlQueryLogicError", "Error in time logic: Year is out of valid range: 1400..10000.", r.array());
            /* r.epoch_time(-17990000000).year() */
            System.out.println("About to run #16: r.epochTime(-17990000000L).year()");
            Object obtained = runOrCatch(r.epochTime(-17990000000L).year(),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #16");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #16");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #16:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // times/constructors.yaml #17
            /* (-17990000000) */
            Long expected_ = -17990000000L;
            /* r.epoch_time(-17990000000).to_epoch_time() */
            System.out.println("About to run #17: r.epochTime(-17990000000L).toEpochTime()");
            Object obtained = runOrCatch(r.epochTime(-17990000000L).toEpochTime(),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #17");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #17");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #17:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        // times/constructors.yaml #18
        // cdate = "2013-01-01"
        System.out.println("Possibly executing: String cdate = (String) ('2013-01-01');");
        String cdate = (String) ("2013-01-01");
                
        // times/constructors.yaml #19
        // dates = ["2013", "2013-01", "2013-01-01", "20130101", "2013-001", "2013001"]
        System.out.println("Possibly executing: List dates = (List) (r.array('2013', '2013-01', '2013-01-01', '20130101', '2013-001', '2013001'));");
        List dates = (List) (r.array("2013", "2013-01", "2013-01-01", "20130101", "2013-001", "2013001"));
                
        // times/constructors.yaml #20
        // ctime = "13:00:00"
        System.out.println("Possibly executing: String ctime = (String) ('13:00:00');");
        String ctime = (String) ("13:00:00");
                
        // times/constructors.yaml #21
        // times = ["13", "13:00", "1300", "13:00:00", "13:00:00.000000", "130000.000000"]
        System.out.println("Possibly executing: List times = (List) (r.array('13', '13:00', '1300', '13:00:00', '13:00:00.000000', '130000.000000'));");
        List times = (List) (r.array("13", "13:00", "1300", "13:00:00", "13:00:00.000000", "130000.000000"));
                
        // times/constructors.yaml #22
        // ctz = "+00:00"
        System.out.println("Possibly executing: String ctz = (String) ('+00:00');");
        String ctz = (String) ("+00:00");
                
        // times/constructors.yaml #23
        // tzs = ["Z", "+00", "+0000", "+00:00"]
        System.out.println("Possibly executing: List tzs = (List) (r.array('Z', '+00', '+0000', '+00:00'));");
        List tzs = (List) (r.array("Z", "+00", "+0000", "+00:00"));
                
        // times/constructors.yaml #24
        // cdt = [cdate+"T"+ctime+ctz]
        System.out.println("Possibly executing: List cdt = (List) (r.array(cdate + 'T' + ctime + ctz));");
        List cdt = (List) (r.array(cdate + "T" + ctime + ctz));
                
        // times/constructors.yaml #28
        // bad_dates = ["201301", "2013-0101", "2a13", "2013+01", "2013-01-01.1"]
        System.out.println("Possibly executing: List bad_dates = (List) (r.array('201301', '2013-0101', '2a13', '2013+01', '2013-01-01.1'));");
        List bad_dates = (List) (r.array("201301", "2013-0101", "2a13", "2013+01", "2013-01-01.1"));
                
        // times/constructors.yaml #29
        // bad_times = ["a3", "13:0000", "13:000", "13:00.00", "130000.00000000a"]
        System.out.println("Possibly executing: List bad_times = (List) (r.array('a3', '13:0000', '13:000', '13:00.00', '130000.00000000a'));");
        List bad_times = (List) (r.array("a3", "13:0000", "13:000", "13:00.00", "130000.00000000a"));
                
        // times/constructors.yaml #30
        // bad_tzs = ["X", "-7", "-07:-1", "+07+01", "PST", "UTC", "Z+00"]
        System.out.println("Possibly executing: List bad_tzs = (List) (r.array('X', '-7', '-07:-1', '+07+01', 'PST', 'UTC', 'Z+00'));");
        List bad_tzs = (List) (r.array("X", "-7", "-07:-1", "+07+01", "PST", "UTC", "Z+00"));
            }
}