package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Action;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/11/04.
 */
public class ActionFactoryTest {

    Map<String, Object> values;
    ActionFactory factory;
    Action movie;

    @Before
    public void setUp()
    {
        values = new HashMap<String, Object>();
        values.put("movie_id", 100);
        values.put("duration", 180);
        values.put("title", "Thor: Ragnarok");
    }

    @Test
    public void getAction() throws Exception {
        movie = factory.getAction(values);

        assertEquals(100, movie.getMovie_Id());
    }

}