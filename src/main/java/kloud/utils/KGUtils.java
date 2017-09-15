package kloud.utils;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

public class KGUtils {
	
	private static final int duration = 21;
	
	public static void init() {
		
	}
	
	public static List<PotionEffect> getScaleEffects() {
		List<PotionEffect> scaleEffects = new ArrayList<PotionEffect>();
		scaleEffects.add(new PotionEffect(MobEffects.STRENGTH, duration, 0));
		scaleEffects.add(new PotionEffect(MobEffects.RESISTANCE, duration, 0));
		scaleEffects.add(new PotionEffect(MobEffects.FIRE_RESISTANCE, duration, 0));
		return scaleEffects;
	}
	
	public static List<PotionEffect> getTribalEffects() {
		List<PotionEffect> tribalEffects = new ArrayList<PotionEffect>();
		tribalEffects.add(new PotionEffect(MobEffects.NIGHT_VISION, 200, 0));
		tribalEffects.add(new PotionEffect(MobEffects.JUMP_BOOST, duration, 0));
		tribalEffects.add(new PotionEffect(MobEffects.STRENGTH, duration, 0));
		return tribalEffects;
	}
	
	public static List<PotionEffect> getThiefEffects() {
		List<PotionEffect> thiefEffects = new ArrayList<PotionEffect>();
		thiefEffects.add(new PotionEffect(MobEffects.SPEED, duration, 0));
		thiefEffects.add(new PotionEffect(MobEffects.NIGHT_VISION, 200, 0));
		thiefEffects.add(new PotionEffect(MobEffects.STRENGTH, duration, 0));
		return thiefEffects;
	}

}
