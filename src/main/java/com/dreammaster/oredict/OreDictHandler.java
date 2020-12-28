package com.dreammaster.oredict;

import com.dreammaster.item.ItemList;
import cpw.mods.fml.common.Loader;
import gregtech.api.util.GT_ModHandler;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import static net.minecraftforge.oredict.OreDictionary.WILDCARD_VALUE;

public class OreDictHandler {
	
	/*
	 * Made by bartimaeusnek
	 */
	
	public static void register_space_dust() {
		reg_dust(OreDictTypes.Asteroids.name(),ItemList.AsteroidsStoneDust.getIS());
		reg_dust(OreDictTypes.BarnardaE.name(),ItemList.BarnardaEStoneDust.getIS());
		reg_dust(OreDictTypes.BarnardaF.name(),ItemList.BarnardaFStoneDust.getIS());
		reg_dust(OreDictTypes.Callisto.name(),ItemList.CallistoStoneDust.getIS());
		reg_dust(OreDictTypes.CentauriA.name(),ItemList.CentauriAStoneDust.getIS());
		reg_dust(OreDictTypes.CentauriA.name(),ItemList.CentauriASurfaceDust.getIS());
		reg_dust(OreDictTypes.Ceres.name(),ItemList.CeresStoneDust.getIS());
		reg_dust(OreDictTypes.Deimos.name(),ItemList.DeimosStoneDust.getIS());
		reg_dust(OreDictTypes.Enceladus.name(),ItemList.EnceladusStoneDust.getIS());
		reg_dust(OreDictTypes.Enceladus.name(),ItemList.EnceladusIceDust.getIS());
		reg_dust(OreDictTypes.Europa.name(),ItemList.EuropaIceDust.getIS());
		reg_dust(OreDictTypes.Europa.name(),ItemList.EuropaStoneDust.getIS());
		reg_dust(OreDictTypes.Ganymede.name(),ItemList.GanymedeStoneDust.getIS());
		reg_dust(OreDictTypes.Haumea.name(),ItemList.HaumeaStoneDust.getIS());
		reg_dust(OreDictTypes.Io.name(),ItemList.IoStoneDust.getIS());
		reg_dust(OreDictTypes.MakeMake.name(),ItemList.MakeMakeStoneDust.getIS());
		reg_dust(OreDictTypes.Mars.name(),ItemList.MarsStoneDust.getIS());
		reg_dust(OreDictTypes.PlanetMercury.name(),ItemList.MercuryStoneDust.getIS());
		reg_dust(OreDictTypes.PlanetMercury.name(),ItemList.MercuryCoreDust.getIS());
		reg_dust(OreDictTypes.Miranda.name(),ItemList.MirandaStoneDust.getIS());
		reg_dust(OreDictTypes.Moon.name(),ItemList.MoonStoneDust.getIS());
		reg_dust(OreDictTypes.Oberon.name(),ItemList.OberonStoneDust.getIS());
		reg_dust(OreDictTypes.Phobos.name(),ItemList.PhobosStoneDust.getIS());
		reg_dust(OreDictTypes.Pluto.name(),ItemList.PlutoIceDust.getIS());
		reg_dust(OreDictTypes.Pluto.name(),ItemList.PlutoStoneDust.getIS());
		reg_dust(OreDictTypes.Proteus.name(),ItemList.ProteusStoneDust.getIS());
		reg_dust(OreDictTypes.TcetiE.name(),ItemList.TCetiEStoneDust.getIS());
		reg_dust(OreDictTypes.Titan.name(),ItemList.TitanStoneDust.getIS());
		reg_dust(OreDictTypes.Triton.name(),ItemList.TritonStoneDust.getIS());
		reg_dust(OreDictTypes.VegaB.name(),ItemList.VegaBStoneDust.getIS());
		reg_dust(OreDictTypes.Venus.name(),ItemList.VenusStoneDust.getIS());
		
		if(Loader.isModLoaded("GalaxySpace")) {
		reg_dust(OreDictTypes.Enceladus.name(),GT_ModHandler.getModItem("GalaxySpace", "item.GlowstoneDusts", 1L,2));
		reg_dust(OreDictTypes.Io.name(),GT_ModHandler.getModItem("GalaxySpace", "item.GlowstoneDusts", 1L,1));
		reg_dust(OreDictTypes.Pluto.name(),GT_ModHandler.getModItem("GalaxySpace", "item.GlowstoneDusts", 1L,4));
		reg_dust(OreDictTypes.Proteus.name(),GT_ModHandler.getModItem("GalaxySpace", "item.GlowstoneDusts", 1L,3));
		reg_dust(OreDictTypes.Ceres.name(),GT_ModHandler.getModItem("GalaxySpace", "item.GlowstoneDusts", 1L));
		}
	}
	
	public static void register_space_rocks() {
		if(Loader.isModLoaded("GalacticraftCore"))
			for (int i=3; i<6;i++)
				reg_rock(OreDictTypes.Moon.name(),GT_ModHandler.getModItem("GalacticraftCore", "tile.moonBlock", 1L, i));
		
		if(Loader.isModLoaded("GalacticraftMars")) {
			for (int i=4; i<7;i++)
				reg_rock(OreDictTypes.Mars.name(),GT_ModHandler.getModItem("GalacticraftMars", "tile.mars", 1L, i));
			
			for (int i=0; i<3;i++)
				reg_rock(OreDictTypes.Asteroids.name(),GT_ModHandler.getModItem("GalacticraftMars", "tile.asteroidsBlock", 1L, i));
		
			reg_rock(OreDictTypes.Mars.name(),GT_ModHandler.getModItem("GalacticraftMars", "tile.mars", 1L, 9));
		}		
		
		if(Loader.isModLoaded("GalaxySpace")) {
			for (int i=0; i<5;i++)
				reg_rock(OreDictTypes.Pluto.name() + "Ice",GT_ModHandler.getModItem("GalaxySpace", "plutoblocks", 1L, i));
				
			for (int i=0; i<3;i++) {
				reg_rock(OreDictTypes.Io.name(),GT_ModHandler.getModItem("GalaxySpace", "ioblocks", 1L, i));
				reg_rock(OreDictTypes.Miranda.name(),GT_ModHandler.getModItem("GalaxySpace", "mirandablocks", 1L, i));
				reg_rock(OreDictTypes.Oberon.name(),GT_ModHandler.getModItem("GalaxySpace", "oberonblocks", 1L, i));
				reg_rock(OreDictTypes.Phobos.name(),GT_ModHandler.getModItem("GalaxySpace", "phobosblocks", 1L, i));
				reg_rock(OreDictTypes.Proteus.name(),GT_ModHandler.getModItem("GalaxySpace", "proteusblocks", 1L, i));
				reg_rock(OreDictTypes.Titan.name(),GT_ModHandler.getModItem("GalaxySpace", "titanblocks", 1L, i));
				reg_rock(OreDictTypes.TcetiE.name(),GT_ModHandler.getModItem("GalaxySpace", "tcetieblocks", 1L, i));
				reg_rock(OreDictTypes.Triton.name(),GT_ModHandler.getModItem("GalaxySpace", "tritonblocks", 1L, i));
			}
			
			for (int i=0;i<2;i++) {
				reg_rock(OreDictTypes.Callisto.name(),GT_ModHandler.getModItem("GalaxySpace", "callistoblocks", 1L, i));
				reg_rock(OreDictTypes.Ceres.name(),GT_ModHandler.getModItem("GalaxySpace", "ceresblocks", 1L, i));
				reg_rock(OreDictTypes.Deimos.name(),GT_ModHandler.getModItem("GalaxySpace", "deimosblocks", 1L, i));
				reg_rock(OreDictTypes.Ganymede.name(),GT_ModHandler.getModItem("GalaxySpace", "ganymedeblocks", 1L, i));
				reg_rock(OreDictTypes.MakeMake.name(),GT_ModHandler.getModItem("GalaxySpace", "makemakegrunt", 1L, i));
				reg_rock(OreDictTypes.PlanetMercury.name() + "Stone",GT_ModHandler.getModItem("GalaxySpace", "mercuryblocks", 1L, i));
				reg_rock(OreDictTypes.Venus.name(),GT_ModHandler.getModItem("GalaxySpace", "venusblocks", 1L, i));
			}
			
			reg_rock(OreDictTypes.Europa.name() + "Stone",GT_ModHandler.getModItem("GalaxySpace", "europagrunt", 1L, 0));
			reg_rock(OreDictTypes.Europa.name() + "Ice",GT_ModHandler.getModItem("GalaxySpace", "europagrunt", 1L, 1));
			reg_rock(OreDictTypes.Europa.name() + "Stone",GT_ModHandler.getModItem("GalaxySpace", "europageyser", 1L, 0));
			reg_rock(OreDictTypes.Europa.name() + "Ice",GT_ModHandler.getModItem("GalaxySpace", "europaunderwatergeyser", 1L, 0));
			reg_rock(OreDictTypes.PlanetMercury.name() + "Core",GT_ModHandler.getModItem("GalaxySpace", "mercuryblocks", 1L, 2));
			reg_rock(OreDictTypes.Enceladus.name() + "Slush",GT_ModHandler.getModItem("GalaxySpace", "enceladusblocks", 1L, 0));
			reg_rock(OreDictTypes.Enceladus.name() + "Stone",GT_ModHandler.getModItem("GalaxySpace", "enceladusblocks", 1L, 1));
			reg_rock(OreDictTypes.Enceladus.name() + "Slush",GT_ModHandler.getModItem("GalaxySpace", "enceladusblocks", 1L, 3));
			reg_rock(OreDictTypes.Pluto.name() + "Stone",GT_ModHandler.getModItem("GalaxySpace", "plutoblocks", 1L, 5));
			reg_rock(OreDictTypes.CentauriA.name() + "Surface",GT_ModHandler.getModItem("GalaxySpace", "acentauribbgrunt", 1L, 0));
			reg_rock(OreDictTypes.CentauriA.name() + "Stone",GT_ModHandler.getModItem("GalaxySpace", "acentauribbsubgrunt", 1L, 0));
			reg_rock(OreDictTypes.BarnardaE.name(),GT_ModHandler.getModItem("GalaxySpace", "barnardaEgrunt", 1L, 0));
			reg_rock(OreDictTypes.BarnardaE.name(),GT_ModHandler.getModItem("GalaxySpace", "barnardaEsubgrunt", 1L, 0));
			reg_rock(OreDictTypes.BarnardaF.name(),GT_ModHandler.getModItem("GalaxySpace", "barnardaFsubgrunt", 1L, 0));
			reg_rock(OreDictTypes.BarnardaF.name(),GT_ModHandler.getModItem("GalaxySpace", "barnardaFgrunt", 1L, 0));
			reg_rock(OreDictTypes.Haumea.name(),GT_ModHandler.getModItem("GalaxySpace", "haumeablocks", 1L, 0));
			reg_rock(OreDictTypes.VegaB.name(),GT_ModHandler.getModItem("GalaxySpace", "vegabsubgrunt", 1L, 0));
			reg_rock(OreDictTypes.VegaB.name(),GT_ModHandler.getModItem("GalaxySpace", "vegabgrunt", 1L, 0));
			reg_rock(OreDictTypes.Ceres.name() + "Glowstone",GT_ModHandler.getModItem("GalaxySpace", "ceresglowstone", 1L, 0));
			reg_rock(OreDictTypes.Enceladus.name() + "Glowstone",GT_ModHandler.getModItem("GalaxySpace", "enceladusglowstone", 1L, 0));
			reg_rock(OreDictTypes.Io.name() + "Glowstone",GT_ModHandler.getModItem("GalaxySpace", "ioglowstone", 1L, 0));
			reg_rock(OreDictTypes.Pluto.name() + "Glowstone",GT_ModHandler.getModItem("GalaxySpace", "plutoglowstone", 1L, 0));
			reg_rock(OreDictTypes.Proteus.name() + "Glowstone",GT_ModHandler.getModItem("GalaxySpace", "proteusglowstone", 1L, 0));
		}
	}
		
	public static void reg_additional() {
		if(Loader.isModLoaded("GalacticraftCore"))
			OreDictionary.registerOre(OreDictTypes.Moon.name() + "DungeonBrick", GT_ModHandler.getModItem("GalacticraftCore", "tile.moonBlock", 1L, 14));
		
		if(Loader.isModLoaded("GalacticraftMars"))
			OreDictionary.registerOre(OreDictTypes.Mars.name() + "DungeonBrick", GT_ModHandler.getModItem("GalacticraftMars", "tile.mars", 1L, 7));
		
		if(Loader.isModLoaded("GalaxySpace")) {
			for (int i = 0; i<6; i++) {
				OreDictionary.registerOre("cropSpace", GT_ModHandler.getModItem("GalaxySpace", "tcetiedandelions", 1L,i));
				OreDictionary.registerOre("cropTcetiESeaweed", GT_ModHandler.getModItem("GalaxySpace", "tcetiedandelions", 1L,i));
			}
			
			OreDictionary.registerOre(OreDictTypes.Ceres.name() + "DungeonBrick", GT_ModHandler.getModItem("GalaxySpace", "ceresblocks", 1L, 2));
			OreDictionary.registerOre(OreDictTypes.Io.name() + "DungeonBrick", GT_ModHandler.getModItem("GalaxySpace", "ioblocks", 1L, 3));
			OreDictionary.registerOre(OreDictTypes.Enceladus.name() + "DungeonBrick", GT_ModHandler.getModItem("GalaxySpace", "enceladusblocks", 1L, 2));
			OreDictionary.registerOre(OreDictTypes.Proteus.name() + "DungeonBrick", GT_ModHandler.getModItem("GalaxySpace", "proteusblocks", 1L, 3));
			OreDictionary.registerOre(OreDictTypes.Pluto.name() + "DungeonBrick", GT_ModHandler.getModItem("GalaxySpace", "plutoblocks", 1L, 6));
		}
		OreDictionary.registerOre("foodSalt", ItemList.EdibleSalt.getIS());

		//Olivine = Peridot
		for (int i = 0; i < OreDictionary.getOres("blockOlivine").size(); i++) {
			OreDictionary.registerOre("blockPeridot", OreDictionary.getOres("blockOlivine").get(i));
		}
	}
	
	public static void register_all() {
		reg_woodItems();
		reg_additional();
		register_space_rocks();
		register_space_dust();
	}

	private static void reg_fenceWood() {
		for (ItemStack itemStack : new ItemStack[]{
				new ItemStack(Blocks.fence),
				GT_ModHandler.getModItem("ExtraTrees", "fence", 1, WILDCARD_VALUE),
				GT_ModHandler.getModItem("Natura", "Natura.fence", 1, WILDCARD_VALUE)
		}) {
			if (itemStack != null) OreDictionary.registerOre("fenceWood", itemStack);
		}
	}

	private static void reg_woodItems() {
		reg_fenceWood(); // Register fenceWood
	}

	private static void reg_dust(String S,ItemStack I) {
		if (I != null) {
		String p = I.getUnlocalizedName().replaceAll("item\\.","").replaceAll("Dust", "").replaceAll(" ", "").trim();
		OreDictionary.registerOre(OreDictTypes.dust.name()+p, I);
		OreDictionary.registerOre(OreDictTypes.dust.name()+S, I);
		OreDictionary.registerOre(OreDictTypes.dust.name()+OreDictTypes.Space.name(),I);
		}
	}

	private static void reg_rock(String S,ItemStack I) {
		if (I != null) {
		OreDictionary.registerOre(OreDictTypes.rock.name()+S, I);
		OreDictionary.registerOre(OreDictTypes.rock.name()+OreDictTypes.Space.name(), I);
		}
	}
}
