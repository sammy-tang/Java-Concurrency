/**
 * 悲观锁
 * 每次去拿数据的时候都认为别人会修改，所以每次在拿数据的时候都会上锁，这样别人想拿这个数据就会block直到它拿到锁。
 * 传统的关系型数据库里边就用到了很多这种锁机制，比如行锁，表锁等都是在做操作之前先上锁。
 * 它指的是对数据被外界（包括本系统当前的其他事务，以及来自外部系统的事务处理）修改持保守态度，
 * 因此，在整个数据处理过程中，将数据处于锁定状态。悲观锁的实现，往往依靠数据库提供的锁机制（
 * 也只有数据库层提供的锁机制才能真正保证数据访问的排他性，否则，即使在本系统中实现了加锁机制，
 * 也无法保证外部系统不会修改数据）
 * <p>
 * Java中悲观锁的实现就是synchronized和Lock相关类
 *
 * 悲观锁的原始开销要高于乐观锁，但特点是一劳永逸，临界区持锁时间就算越来越差，也不会对互斥锁的开销造成影响
 * 适合并发写入多、临界区持锁时间比较长的情况，可避免大量无用自旋等消耗
 * 1.临界区有IO操作
 * 2.临界区代码复杂或者循环量大
 * 3.临界区竞争激烈
 *
 * @Author: zzStar
 * @Date: 10-09-2020 14:23
 */
public class PessimisticLock {

}
