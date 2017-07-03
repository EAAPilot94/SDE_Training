import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LabTest {
		
		@Test
		public void testPerformer() {
			Performer perf = new Performer(1);
			assertEquals("Testing performer get ID", 1, perf.getID());
			assertEquals("Testing performer toString", 1 + " - Performer", perf.toString());
		}
		
		@Test
		public void testVocalist(){
			Vocalist voc = new Vocalist(2, "Bb", 5);
			assertEquals("Testing vocalist get ID", 2, voc.getID());
			assertEquals("Testing vocalist get key", "Bb", voc.getKey());
			assertEquals("Testing vocalist get volume", 5, voc.getVolume());
		}
		
		@Test
		public void testVocalistSet(){
			Vocalist voc2 = new Vocalist(2, "Bb");
			assertEquals("Testing to String", "I sing in the key of - " 
			+ voc2.getKey() + " - " + voc2.getID(), voc2.toString());
			voc2.setVolume(2);			
			assertEquals("Testing vocalist toString", 
					"I sing in the key of - " + voc2.getKey() + " - at the volume " + voc2.getVolume()
					+ " - " + voc2.getID(), voc2.toString());
		}
		
		@Test
		public void testDancer(){
			Dancer dance = new Dancer(3, "Line Dancing");
			assertEquals("Testing dancer get ID", 3, dance.getID());
			assertEquals("Testing dancer get style", "Line Dancing", dance.getStyle());
			assertEquals("Testing dancer to string", dance.getStyle() + " - " + dance.getID() + " - Dancer",
					dance.toString());
		}
		
		
}