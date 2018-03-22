package spring.beggining.ch5.spittr.config;

import java.util.List;

public interface SpittleRepository {
	List<Spittle> findSpittles(long max, int count);

	Object findOne(long spittleId);


}
