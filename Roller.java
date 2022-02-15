import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Roller {
    public static boolean is_pure_stock = false;
    public static boolean is_clone_comfort = false;
    public static boolean is_clone_labor = false;
    public static boolean is_clone_military = false;
    public static boolean is_bioreplica_pleasure = false;
    public static boolean is_bioreplica_industrial = false;
    public static boolean is_bioreplica_clerical = false;
    public static boolean is_bioreplica_infiltration = false;
    public static boolean is_bioreplica_battle = false;
    public static boolean is_trans_human = false;
    public static boolean is_cyborg = false;
    public static boolean is_bestial_human = false;
    public static boolean is_ghost_mutant = false;
    public static boolean is_mutant_mild = false;
    public static boolean is_mutant_typical = false;
    public static boolean is_mutant_severe = false;
    public static boolean is_mutant_freakish_horror = false;
    public static int end = 0;
    public static int str = 0;
    public static int ag = 0;
    public static int acc = 0;
    public static int intel = 0;
    public static int per = 0;
    public static int will = 0;
    public static int app = 0;
    public static int swimming_ability = 0;
    public static boolean is_slave_labor = false;
    public static boolean is_slave_kitchen = false;
    public static boolean is_slave_servant = false;
    public static boolean is_slave_whore = false;
    public static boolean is_slave_court = false;
    public static boolean is_slave_gladiator = false;
    public static boolean is_fisher = false;
    public static boolean is_hunter = false;
    public static boolean is_miner = false;
    public static boolean is_logger = false;
    public static boolean is_farmer = false;
    public static boolean is_nomad = false;
    public static boolean is_trader = false;
    public static boolean is_crafts_person = false;
    public static boolean is_student = false;
    public static boolean is_scribe = false;
    public static boolean is_technician = false;
    public static boolean is_street_urchin = false;
    public static boolean is_street_thug = false;
    public static boolean is_raider = false;
    public static boolean is_pirate = false;
    public static boolean is_thief = false;
    public static boolean is_assassin = false;
    public static boolean is_draftee = false;
    public static boolean is_militia_soldier = false;
    public static boolean is_watchman = false;
    public static boolean is_infantry_man = false;
    public static boolean is_calvary = false;
    public static boolean is_mercenary = false;
    public static boolean is_elite_soldier = false;
    public static int criminal_skills = 0;
    public static int warrior_skills = 0;
    public static int educated_skills = 0;
    public static int misc_skills = 0;
    public static String starting_pack = "Null";
    public static boolean can_read_and_write = false;
    public static boolean can_do_math = false;


    public static int d100(){
        Random rand = new Random();
        int d100 = rand.nextInt(100) + 1;
        return d100;
    }

    public static int d20(){
        Random rand = new Random();
        int d20 = rand.nextInt(20) + 1;
        return d20;
    }

    public static int d6(){
        Random rand = new Random();
        int d6 = rand.nextInt(6) + 1;
        return d6;
    }

    public static int d10(){
        Random rand = new Random();
        int d10 = rand.nextInt(10) + 1;
        return d10;
    }

    public static int d4(){
        Random rand = new Random();
        int d4 = rand.nextInt(4)+1;
        return d4;
    }

    public static int d3(){
        Random rand = new Random();
        int d3 = rand.nextInt(3) + 1;
        return d3;
    }

    public static int d2(){
        Random rand = new Random();
        int d2 = rand.nextInt(2)+1;
        return d2;
    }

    public static String roll_Gender(){
        String[] genders = {"Male", "Female"};
        String gender = genders[d2()-1];
        return gender;
    }

    public static String rolltype(int x) {
        int a = d100();
        String type = "None";
        String[] types = {"Pure Stock", "Clone, Comfort", "Clone, Labor", "Clone, Military",
                "Bioreplica, Pleasure", "Bioreplica, Industrial", "Bioreplica, Clerical", "Bioreplica, Infiltration",
                "Bioreplica, Battle", "Trans-Human", "Cyborg", "Bestial Human", "Ghost Mutant", "Mutant, Mild",
                "Mutant, Typical", "Mutant, Severe", "Mutant, Freakish Horror"};

        if (x == 1) {
            if(a <= 31){
                type = types[0];
                is_pure_stock = true;
            }else if(a == 33){
                type = types[1];
                is_clone_comfort = true;
            }else if (a == 34){
                type = types[2];
                is_clone_labor = true;
            }else if (a ==35){
                type = types[3];
                is_clone_military = true;
            }else if (a == 36){
                type = types[4];
                is_bioreplica_pleasure = true;
            }else if(a == 37){
                type = types[5];
                is_bioreplica_industrial = true;
            }else if(a == 38){
                type = types[6];
                is_bioreplica_clerical = true;
            }else if(a == 39){
                type = types[7];
                is_bioreplica_infiltration = true;
            }else if(a == 40){
                type = types[8];
                is_bioreplica_battle = true;
            }else if(a == 41){
                type = types[8];
                is_trans_human = true;
            }else if(a >= 42 && a <= 55){
                type = types[9];
                is_cyborg = true;
            }else if(a >= 56 && a <= 61){
                type = types[10];
                is_bestial_human = true;
            }else if( a >= 62 && a <= 68){
                type = types[11];
                is_ghost_mutant = true;
            }else if (a >= 69 && a <= 87){
                type = types[12];
                is_mutant_mild = true;
            }else if(a >= 88 && a <= 98){
                type = types[13];
                is_mutant_typical = true;
            }else if(a == 90 || a == 100){
                type = types[14];
                is_mutant_severe = true;
            }

        }else if (x==2){
            if(a <= 21){
                type = types[0];
                is_pure_stock = true;
            }else if(a == 22){
                type = types[1];
                is_clone_comfort = true;
            }else if (a == 23){
                type = types[2];
                is_clone_labor = true;
            }else if (a >= 24 && a <= 30){
                type = types[3];
                is_clone_military = true;
            }else if (a == 31){
                type = types[4];
                is_bioreplica_pleasure = true;
            }else if(a == 32 || a == 33){
                type = types[5];
                is_bioreplica_industrial = true;
            }else if(a == 34){
                type = types[6];
                is_bioreplica_clerical = true;
            }else if(a == 35 || a == 36){
                type = types[7];
                is_bioreplica_infiltration = true;
            }else if(a >= 37 && a <= 40){
                type = types[8];
                is_bioreplica_battle = true;
            }else if(a >= 41 && a <= 45){
                type = types[8];
                is_trans_human = true;
            }else if(a >= 46 && a <= 56){
                type = types[9];
                is_cyborg = true;
            }else if(a >= 57 && a <= 65){
                type = types[10];
                is_bestial_human = true;
            }else if( a >= 66 && a <= 73){
                type = types[11];
                is_ghost_mutant = true;
            }else if (a >= 74 && a <= 79){
                type = types[12];
                is_mutant_mild = true;
            }else if(a >= 80 && a <= 90){
                type = types[13];
                is_mutant_typical = true;
            }else if(a >= 91 && a <= 98){
                type = types[14];
                is_mutant_severe = true;
            }else if(a == 99 || a == 100){
                type = types[15];
                is_mutant_freakish_horror = true;
            }

        }else{
            if (a <= 21){
                type = types[0];
                is_pure_stock = true;
            }else if (a == 15){
                type = types[2];
                is_clone_labor = true;
            }else if (a >= 17 && a <= 21){
                type = types[3];
                is_clone_military = true;
            }else if (a == 22 || a == 23){
                type = types[5];
                is_bioreplica_industrial = true;
            }else if (a == 24){
                type = types[6];
                is_bioreplica_clerical = true;
            }else if (a >= 25 && a <= 27){
                type = types[7];
                is_bioreplica_infiltration = true;
            }else if (a >= 28 && a <= 33){
                type = types[8];
                is_bioreplica_battle = true;
            }else if (a >= 34 && a <= 37){
                type = types[9];
                is_trans_human = true;
            }else if (a >= 38 && a <= 49){
                type = types[10];
                is_cyborg = true;
            }else if (a >= 50 && a <= 57){
                type = types[11];
                is_bestial_human = true;
            }else if (a >= 58 && a <= 66){
                type = types[12];
                is_ghost_mutant = true;
            }else if (a == 67 || a == 68){
                type = types[13];
                is_mutant_mild = true;
            }else if (a >= 69 && a <= 81){
                type = types[14];
                is_mutant_typical = true;
            }else if (a >= 82 && a <= 93){
                type = types[15];
                is_mutant_severe = true;
            }else if (a >= 94 && a <= 100){
                type = types[16];
                is_mutant_freakish_horror = true;
            }
        }
        return type;
    }

    public static int rollstatvalue(){
        int a, b = 0;
        a = d100();
        switch(a){
            case 1: {
                b = d100();
                break;
            }
            case 2: {
                b = 11;
                break;
            }
            case 3: {
                b = 12;
                break;
            }
            case 4: {
                b = 13;
                break;
            }
            case 5: {
                b = 14;
                break;
            }
            case 6, 7: {
                b = 15;
                break;
            }
            case 8, 9: {
                b = 16;
                break;
            }
            case 10, 11: {
                b = 17;
                break;
            }
            case 12, 13, 14: {
                b = 18;
                break;
            }
            case 15, 16, 17: {
                b = 19;
                break;
            }
            case 18, 19, 20, 21: {
                b = 20;
                break;
            }
            case 22, 23, 24, 25: {
                b = 21;
                break;
            }
            case 26, 27, 28, 29, 30: {
                b = 22;
                break;
            }
            case 31, 32, 33, 34, 35: {
                b = 23;
                break;
            }
            case 36, 37: {
                b = 24;
                break;
            }
            case 38, 39: {
                b = 25;
                break;
            }
            case 40, 41: {
                b = 26;
                break;
            }
            case 42, 43: {
                b = 27;
                break;
            }
            case 44, 45: {
                b = 28;
                break;
            }
            case 46, 47: {
                b = 29;
                break;
            }
            case 48, 49: {
                b = 30;
                break;
            }
            case 50, 51: {
                b = 31;
                break;
            }
            case 52, 53: {
                b = 32;
                break;
            }
            case 54, 55: {
                b = 33;
                break;
            }
            case 56, 57: {
                b = 34;
                break;
            }
            case 58, 59: {
                b = 35;
                break;
            }
            case 60, 61: {
                b = 36;
                break;
            }
            case 62, 63: {
                b = 37;
                break;
            }
            case 64, 65: {
                b = 38;
                break;
            }
            case 66, 67: {
                b = 39;
                break;
            }
            case 68, 69: {
                b = 40;
                break;
            }
            case 70, 71, 72, 73, 74, 75, 76,
                    77, 78, 79, 80, 81, 82,
                83, 84, 85, 86, 87, 88, 89, 90: {
                b = 40 + d20();
                break;
            }
            case 91, 92, 93, 94, 95, 96: {
                b = 60 + d20();
                break;
            }
            case 97, 98, 99: {
                b = 80 + d20();
                break;
            }
            case 100: {
                b = 100 + d20();
                break;
            }
        }
        System.out.println("Computer rolled: " + a + " which is a " + b);
        return b;
    }
//TODO add how many skill rolls each caste gets.
    public static String roll_caste(){
        String[] castes = {"Slave, Labor", "Slave, Kitchen", "Slave, Servant",
        "Slave, Whore", "Slave, Court", "Slave, Gladiator", "Fisher", "Hunter",
        "Miner", "Logger", "Farmer", "Nomad", "Trader", "Craftsperson", "Student",
        "Scribe", "Technician", "Street Urchin", "Street Thug", "Raider", "Pirate",
        "Thief", "Assassin", "Draftee", "Militia Soldier", "Watchman", "Infantryman",
        "Cavalry", "Mercenary", "Elite Soldier"};
        String player_caste = "Null";
        int caste = d100();

        if(is_pure_stock){
            System.out.println("Add +10 points to traits of your choosing");
            String[] ps_skills = {"+Brawling", "+Stealth", "+Weapon Expert: ", "+Dodge", "+1 to all traits"
            , "Endurance", "Strength", "Agility", "Accuracy", "Intelligence", "Willpower", "Appearance",
            "+Martial Arts", "+2 to all traits", "to all traits"};

            String skill = "Null";
            for(int i = 0; i < 2; i++){
                int bonus_skill = d100();
                //System.out.println(bonus_skill);
                int bonus_roll_1 = d6();
                int bonus_roll_2 = d6();
                int bonus_roll_3 = d6();
                int weapon_exp = d100();

                switch(bonus_skill){
                    case 1, 2, 3, 4, 5: {
                        skill = ps_skills[0];
                        System.out.println(skill);
                        break;
                    }
                    case 6, 7, 8, 9, 10: {
                        skill = ps_skills[1];
                        System.out.println(skill);
                        break;
                    }
                    case 11, 12, 13, 14, 15: {
                        skill = ps_skills[2];
                        System.out.println(skill + " #" + weapon_exp);
                        break;
                    }
                    case 16, 17, 18, 19, 20: {
                        skill = ps_skills[3];
                        System.out.println(skill);
                        break;
                    }
                    case 21, 22, 23, 24, 25, 26,
                            27, 28, 29, 30, 31, 32,
                            33, 34, 35, 36, 37: {
                        skill = ps_skills[4];
                        System.out.println(skill);
                        break;
                    }
                    case 38, 39, 40, 41, 42, 43, 44: {
                        skill = ps_skills[5];
                        System.out.println("+" + bonus_roll_1 + bonus_roll_2 + skill);
                        break;
                    }
                    case 45, 46, 47, 48, 49, 50, 51: {
                        skill = ps_skills[6];
                        System.out.println("+" + bonus_roll_1 + bonus_roll_2 + skill);
                        break;
                    }
                    case 52, 53, 54, 55, 56, 57, 58: {
                        skill = ps_skills[7];
                        System.out.println("+" + bonus_roll_1 + bonus_roll_2 + skill);
                        break;
                    }
                    case 59, 60, 61, 62, 63, 64, 65: {
                        skill = ps_skills[8];
                        System.out.println("+" + bonus_roll_1 + bonus_roll_2 + skill);
                        break;
                    }
                    case 66, 67, 68, 69, 70, 71,
                            72, 73, 74: {
                        skill = ps_skills[9];
                        System.out.println("+" + bonus_roll_1 + bonus_roll_2 + bonus_roll_3 + skill);
                        break;
                    }
                    case 75, 76, 77, 78, 79, 80,
                            81, 82, 83: {
                        skill = ps_skills[10];
                        System.out.println("+" + bonus_roll_1 + bonus_roll_2 + skill);
                        break;
                    }
                    case 84, 85, 86, 87, 88, 89, 90: {
                        skill = ps_skills[11];
                        System.out.println("+" + bonus_roll_1 + bonus_roll_2 + bonus_roll_3 + skill);
                        break;
                    }
                    case 91, 92, 93, 94, 95, 96, 97: {
                        skill = ps_skills[12];
                        System.out.println("+" + bonus_roll_1 + bonus_roll_2 + bonus_roll_3 + skill);
                        break;
                    }
                    case 98, 99: {
                        skill = ps_skills[13];
                        System.out.println(skill);
                        break;
                    }
                    case 100: {
                        skill = ps_skills[14];
                        System.out.println("+" + bonus_roll_1 + skill);
                        break;
                    }
                }
            }

            switch(caste){
                case 1: {
                    player_caste = castes[0];
                    System.out.println("You are a " + player_caste);
                    is_slave_labor = true;
                    break;
                }
                case 2: {
                    player_caste = castes[1];
                    System.out.println("You are a " + player_caste);
                    is_slave_kitchen = true;
                    break;
                }
                case 3: {
                    player_caste = castes[2];
                    System.out.println("You are a " + player_caste);
                    is_slave_servant = true;
                    break;
                }
                case 4: {
                    player_caste = castes[3];
                    System.out.println("You are a " + player_caste);
                    is_slave_whore = true;
                    break;
                }
                case 5: {
                    player_caste = castes[4];
                    System.out.println("You are a " + player_caste);
                    is_slave_court = true;
                    break;
                }
                case 6: {
                    player_caste = castes[5];
                    System.out.println("You are a " + player_caste);
                    is_slave_gladiator = true;
                    break;
                }
                case 7, 8: {
                    player_caste = castes[6];
                    System.out.println("You are a " + player_caste);
                    is_fisher = true;
                    break;
                }
                case 9, 10: {
                    player_caste = castes[7];
                    System.out.println("You are a " + player_caste);
                    is_hunter = true;
                    break;
                }
                case 11, 12: {
                    player_caste = castes[8];
                    System.out.println("You are a " + player_caste);
                    is_miner = true;
                    break;
                }
                case 13, 14: {
                    player_caste = castes[9];
                    System.out.println("You are a " + player_caste);
                    is_logger = true;
                    break;
                }
                case 15, 16: {
                    player_caste = castes[10];
                    System.out.println("You are a " + player_caste);
                    is_farmer = true;
                    break;
                }
                case 17, 18: {
                    player_caste = castes[11];
                    System.out.println("You are a " + player_caste);
                    is_nomad = true;
                    break;
                }
                case 19, 20, 21, 22: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 23, 24: {
                    player_caste = castes[13];
                    System.out.println("You are a " + player_caste);
                    is_crafts_person = true;
                    break;
                }
                case 25, 26, 27, 28, 29, 30, 31,
                        32, 33, 34, 35, 36: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 37, 38, 39: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 40, 41, 42, 43, 44, 45, 46, 47,
                        48, 49, 50, 51, 52, 53, 54,
                        55, 56, 57, 58, 59, 60, 61,
                        62, 63, 64, 65, 66, 67, 68,
                        69, 70, 71, 72, 73, 74: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 75: {
                    player_caste = castes[17];
                    System.out.println("You are a " + player_caste);
                    is_street_urchin = true;
                    break;
                }
                case 76: {
                    player_caste = castes[18];
                    System.out.println("You are a " + player_caste);
                    is_street_thug = true;
                    break;
                }
                case 77: {
                    player_caste = castes[19];
                    System.out.println("You are a " + player_caste);
                    is_raider = true;
                    break;
                }
                case 78: {
                    player_caste = castes[20];
                    System.out.println("You are a " + player_caste);
                    is_pirate = true;
                    break;
                }
                case 79, 80: {
                    player_caste = castes[21];
                    System.out.println("You are a " + player_caste);
                    is_thief = true;
                    break;
                }
                case 81, 82, 83, 84, 85: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 86: {
                    player_caste = castes[23];
                    System.out.println("You are a " + player_caste);
                    is_draftee = true;
                    break;
                }
                case 87: {
                    player_caste = castes[24];
                    System.out.println("You are a " + player_caste);
                    is_militia_soldier = true;
                    break;
                }
                case 88: {
                    player_caste = castes[25];
                    System.out.println("You are a " + player_caste);
                    is_watchman = true;
                    break;
                }
                case 89, 90: {
                    player_caste = castes[26];
                    System.out.println("You are a " + player_caste);
                    is_infantry_man = true;
                    break;
                }
                case 91, 92: {
                    player_caste = castes[27];
                    System.out.println("You are a " + player_caste);
                    is_calvary = true;
                    break;
                }
                case 93, 94: {
                    player_caste = castes[28];
                    System.out.println("You are a " + player_caste);
                    is_mercenary = true;
                    break;
                }
                case 95, 96, 97, 98, 99, 100: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
            }
        }else if(is_clone_comfort){
            switch(caste){
                case 1: {
                    player_caste = castes[0];
                    System.out.println("You are a " + player_caste);
                    is_slave_labor = true;
                    break;
                }
                case 2, 3, 4, 5, 6, 7,
                        8, 9: {
                    player_caste = castes[1];
                    System.out.println("You are a " + player_caste);
                    is_slave_kitchen = true;
                    break;
                }
                case 10, 11, 12, 13, 14,
                        15, 16, 17, 18, 19,
                        20, 21, 22, 23, 24: {
                    player_caste = castes[2];
                    System.out.println("You are a " + player_caste);
                    is_slave_servant = true;
                    break;
                }
                case 25, 26, 27, 28, 29, 30, 31,
                        32, 33, 34, 35, 36, 37, 38,
                        39, 40, 41, 42, 43, 44, 45,
                        46, 47, 48, 49, 50, 51, 52,
                        53, 54, 55, 56, 57, 58, 59,
                        60, 61, 62, 63, 64, 65, 66,
                        67, 68, 69, 70, 71, 72, 73,
                        74, 75, 76, 77, 78, 79, 80,
                        81, 82, 83, 84, 85, 86, 87,
                        88, 89, 90, 91, 92: {
                    player_caste = castes[3];
                    System.out.println("You are a " + player_caste);
                    is_slave_whore = true;
                    break;
                }
                case 93, 94, 95, 96, 97: {
                    player_caste = castes[4];
                    System.out.println("You are a " + player_caste);
                    is_slave_court = true;
                    break;
                }
                case 98: {
                    player_caste = castes[13];
                    System.out.println("You are a " + player_caste);
                    is_crafts_person = true;
                    break;
                }
                case 99: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 100: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
            }
        }else if(is_clone_labor){
            switch(caste){
                case 1, 2, 3, 4, 5, 6, 7,
                        8, 9, 10, 11, 12,
                        13, 14, 15, 16,
                        17, 18, 19, 20, 21,
                        22, 23, 24, 25, 26,
                        27, 28, 29, 30, 31,
                        32, 33, 34, 35, 36,
                        37, 38, 39, 40, 41,
                        42, 43: {
                    player_caste = castes[0];
                    System.out.println("You are a " + player_caste);
                    is_slave_labor = true;
                    break;
                }
                case 44, 45, 46: {
                    player_caste = castes[1];
                    System.out.println("You are a " + player_caste);
                    is_slave_kitchen = true;
                    break;
                }
                case 47: {
                    player_caste = castes[2];
                    System.out.println("You are a " + player_caste);
                    is_slave_servant = true;
                    break;
                }
                case 48, 49, 50, 51, 52,
                        53, 54, 55, 56: {
                    player_caste = castes[5];
                    System.out.println("You are a " + player_caste);
                    is_slave_gladiator = true;
                    break;
                }
                case 57: {
                    player_caste = castes[6];
                    System.out.println("You are a " + player_caste);
                    is_fisher = true;
                    break;
                }
                case 58: {
                    player_caste = castes[7];
                    System.out.println("You are a " + player_caste);
                    is_hunter = true;
                    break;
                }
                case 59, 60, 61, 62, 63, 64, 65,
                        66: {
                    player_caste = castes[8];
                    System.out.println("You are a " + player_caste);
                    is_miner = true;
                    break;
                }
                case 67, 68, 69, 70, 71,
                        72, 73, 74: {
                    player_caste = castes[9];
                    System.out.println("You are a " + player_caste);
                    is_logger = true;
                    break;
                }
                case 75, 76, 77, 78, 79, 80,
                        81, 82: {
                    player_caste = castes[10];
                    System.out.println("You are a " + player_caste);
                    is_farmer = true;
                    break;
                }
                case 83: {
                    player_caste = castes[11];
                    System.out.println("You are a " + player_caste);
                    is_nomad = true;
                    break;
                }
                case 84, 85: {
                    player_caste = castes[13];
                    System.out.println("You are a " + player_caste);
                    is_crafts_person = true;
                    break;
                }
                case 86, 87: {
                    player_caste = castes[18];
                    System.out.println("You are a " + player_caste);
                    is_street_thug = true;
                    break;
                }
                case 88: {
                    player_caste = castes[19];
                    System.out.println("You are a " + player_caste);
                    is_raider = true;
                    break;
                }
                case 89: {
                    player_caste = castes[20];
                    System.out.println("You are a " + player_caste);
                    is_pirate = true;
                    break;
                }
                case 90, 91, 92, 93: {
                    player_caste = castes[23];
                    System.out.println("You are a " + player_caste);
                    is_draftee = true;
                    break;
                }
                case 94: {
                    player_caste = castes[24];
                    System.out.println("You are a " + player_caste);
                    is_militia_soldier = true;
                    break;
                }
                case 95: {
                    player_caste = castes[25];
                    System.out.println("You are a " + player_caste);
                    is_watchman = true;
                    break;
                }
                case 96: {
                    player_caste = castes[26];
                    System.out.println("You are a " + player_caste);
                    is_infantry_man = true;
                    break;
                }
                case 97: {
                    player_caste = castes[27];
                    System.out.println("You are a " + player_caste);
                    is_calvary = true;
                    break;
                }
                case 98, 99: {
                    player_caste = castes[28];
                    System.out.println("You are a " + player_caste);
                    is_mercenary = true;
                    break;
                }
                case 100: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
            }
        }else if(is_clone_military){
            switch(caste){
                case 1, 2: {
                    player_caste = castes[0];
                    System.out.println("You are a " + player_caste);
                    is_slave_labor = true;
                    break;
                }
                case 3, 4, 5, 6, 7, 8, 9,
                        10, 11, 12, 13, 14,
                        15, 16, 17, 18, 19,
                        20, 21, 22, 23, 24,
                        25, 26, 27, 28, 29: {
                    player_caste = castes[5];
                    System.out.println("You are a " + player_caste);
                    is_slave_gladiator = true;
                    break;
                }
                case 30: {
                    player_caste = castes[7];
                    System.out.println("You are a " + player_caste);
                    is_hunter = true;
                    break;
                }
                case 31, 32: {
                    player_caste = castes[11];
                    System.out.println("You are a " + player_caste);
                    is_nomad = true;
                    break;
                }
                case 33, 34, 35, 36, 37: {
                    player_caste = castes[18];
                    System.out.println("You are a " + player_caste);
                    is_street_thug = true;
                    break;
                }
                case 38, 39: {
                    player_caste = castes[19];
                    System.out.println("You are a " + player_caste);
                    is_raider = true;
                    break;
                }

                case 40, 41: {
                    player_caste = castes[20];
                    System.out.println("You are a " + player_caste);
                    is_pirate = true;
                    break;
                }
                case 42, 43, 44, 45, 46: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 47: {
                    player_caste = castes[23];
                    System.out.println("You are a " + player_caste);
                    is_draftee = true;
                    break;
                }
                case 48, 49: {
                    player_caste = castes[24];
                    System.out.println("You are a " + player_caste);
                    is_militia_soldier = true;
                    break;
                }
                case 50, 51, 52, 53, 54, 55: {
                    player_caste = castes[25];
                    System.out.println("You are a " + player_caste);
                    is_watchman = true;
                    break;
                }
                case 56, 57, 58: {
                    player_caste = castes[26];
                    System.out.println("You are a " + player_caste);
                    is_infantry_man = true;
                    break;
                }
                case 59, 60, 61, 62, 63, 64, 65,
                        66: {
                    player_caste = castes[27];
                    System.out.println("You are a " + player_caste);
                    is_calvary = true;
                    break;
                }
                case 67, 68, 69, 70, 71, 72, 73,
                        74, 75, 76, 77, 78, 79,
                        80, 81, 82, 83, 84, 85,
                        86, 87, 88, 89: {
                    player_caste = castes[28];
                    System.out.println("You are a " + player_caste);
                    is_mercenary = true;
                    break;
                }
                case 90, 91, 92, 93, 94, 95,
                        96, 97, 98, 99, 100: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
            }
        }else if(is_bioreplica_pleasure){
            switch(caste){
                case 1: {
                    player_caste = castes[0];
                    System.out.println("You are a " + player_caste);
                    is_slave_labor = true;
                    break;
                }
                case 2, 3, 4, 5, 6: {
                    player_caste = castes[1];
                    System.out.println("You are a " + player_caste);
                    is_slave_kitchen = true;
                    break;
                }
                case 7, 8, 9, 10, 11, 12: {
                    player_caste = castes[2];
                    System.out.println("You are a " + player_caste);
                    is_slave_servant = true;
                    break;
                }
                case 13, 14, 15, 16, 17, 18,
                        19, 20, 21, 22, 23,
                        24, 25, 26, 27, 28,
                        29, 30, 31, 32, 33,
                        34, 35, 36, 37, 38,
                        39, 40, 41, 42, 43,
                        44, 45, 46, 47, 48,
                        49, 50, 51, 52, 53,
                        54, 55, 56, 57, 58,
                        59, 60, 61, 62, 63,
                        64, 65, 66, 67, 68,
                        69, 70, 71, 72, 73,
                        74, 75, 76, 77, 78,
                        79, 80, 81, 82, 83,
                        84, 85: {
                    player_caste = castes[3];
                    System.out.println("You are a " + player_caste);
                    is_slave_whore = true;
                    break;
                }
                case 86, 87, 88, 89, 90, 91: {
                    player_caste = castes[4];
                    System.out.println("You are a " + player_caste);
                    is_slave_court = true;
                    break;
                }
                case 92, 93: {
                    player_caste = castes[11];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 94: {
                    player_caste = castes[13];
                    System.out.println("You are a " + player_caste);
                    is_crafts_person = true;
                    break;
                }
                case 95: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 96, 97, 98: {
                    player_caste = castes[17];
                    System.out.println("You are a " + player_caste);
                    is_street_urchin = true;
                    break;
                }
                case 99, 100: {
                    player_caste = castes[21];
                    System.out.println("You are a " + player_caste);
                    is_thief = true;
                    break;
                }
            }

        }else if(is_bioreplica_industrial){
            switch(caste){
                case 1: {
                    player_caste = castes[0];
                    System.out.println("You are a " + player_caste);
                    is_slave_labor = true;
                    break;
                }
                case 2: {
                    player_caste = castes[1];
                    System.out.println("You are a " + player_caste);
                    is_slave_kitchen = true;
                    break;
                }
                case 3: {
                    player_caste = castes[2];
                    System.out.println("You are a " + player_caste);
                    is_slave_servant = true;
                    break;
                }
                case 4: {
                    player_caste = castes[3];
                    System.out.println("You are a " + player_caste);
                    is_slave_whore = true;
                    break;
                }
                case 5: {
                    player_caste = castes[4];
                    System.out.println("You are a " + player_caste);
                    is_slave_court = true;
                    break;
                }
                case 6: {
                    player_caste = castes[5];
                    System.out.println("You are a " + player_caste);
                    is_slave_gladiator = true;
                    break;
                }
                case 7: {
                    player_caste = castes[6];
                    System.out.println("You are a " + player_caste);
                    is_fisher = true;
                    break;
                }
                case 8: {
                    player_caste = castes[6];
                    System.out.println("You are a " + player_caste);
                    is_fisher = true;
                    break;
                }
                case 9: {
                    player_caste = castes[7];
                    System.out.println("You are a " + player_caste);
                    is_hunter = true;
                    break;
                }
                case 10: {
                    player_caste = castes[7];
                    System.out.println("You are a " + player_caste);
                    is_hunter = true;
                    break;
                }
                case 11: {
                    player_caste = castes[8];
                    System.out.println("You are a " + player_caste);
                    is_miner = true;
                    break;
                }
                case 12: {
                    player_caste = castes[8];
                    System.out.println("You are a " + player_caste);
                    is_miner = true;
                    break;
                }
                case 13: {
                    player_caste = castes[9];
                    System.out.println("You are a " + player_caste);
                    is_logger = true;
                    break;
                }
                case 14: {
                    player_caste = castes[9];
                    System.out.println("You are a " + player_caste);
                    is_logger = true;
                    break;
                }
                case 15: {
                    player_caste = castes[10];
                    System.out.println("You are a " + player_caste);
                    is_farmer = true;
                    break;
                }
                case 16: {
                    player_caste = castes[10];
                    System.out.println("You are a " + player_caste);
                    is_farmer = true;
                    break;
                }
                case 17: {
                    player_caste = castes[11];
                    System.out.println("You are a " + player_caste);
                    is_nomad = true;
                    break;
                }
                case 18: {
                    player_caste = castes[11];
                    System.out.println("You are a " + player_caste);
                    is_nomad = true;
                    break;
                }
                case 19: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 20: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 21: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 22: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 23: {
                    player_caste = castes[13];
                    System.out.println("You are a " + player_caste);
                    is_crafts_person = true;
                    break;
                }
                case 24: {
                    player_caste = castes[13];
                    System.out.println("You are a " + player_caste);
                    is_crafts_person = true;
                    break;
                }
                case 25: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 26: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 27: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 28: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 29: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 30: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 31: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 32: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 33: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 34: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 35: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 36: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 37: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 38: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 39: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 40: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 41: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 42: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 43: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 44: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 45: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 46: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 47: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 48: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 49: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 50: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 51: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 52: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 53: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 54: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 55: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 56: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 57: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 58: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 59: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 60: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 61: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 62: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 63: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 64: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 65: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 66: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 67: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 68: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 69: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 70: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 71: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 72: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 74: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 75: {
                    player_caste = castes[17];
                    System.out.println("You are a " + player_caste);
                    is_street_urchin = true;
                    break;
                }
                case 76: {
                    player_caste = castes[18];
                    System.out.println("You are a " + player_caste);
                    is_street_thug = true;
                    break;
                }
                case 77: {
                    player_caste = castes[19];
                    System.out.println("You are a " + player_caste);
                    is_raider = true;
                    break;
                }
                case 78: {
                    player_caste = castes[20];
                    System.out.println("You are a " + player_caste);
                    is_pirate = true;
                    break;
                }
                case 79: {
                    player_caste = castes[21];
                    System.out.println("You are a " + player_caste);
                    is_thief = true;
                    break;
                }
                case 80: {
                    player_caste = castes[21];
                    System.out.println("You are a " + player_caste);
                    is_thief = true;
                    break;
                }
                case 81: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 82: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 83: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 84: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 85: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 86: {
                    player_caste = castes[23];
                    System.out.println("You are a " + player_caste);
                    is_draftee = true;
                    break;
                }
                case 87: {
                    player_caste = castes[24];
                    System.out.println("You are a " + player_caste);
                    is_militia_soldier = true;
                    break;
                }
                case 88: {
                    player_caste = castes[25];
                    System.out.println("You are a " + player_caste);
                    is_watchman = true;
                    break;
                }
                case 89: {
                    player_caste = castes[26];
                    System.out.println("You are a " + player_caste);
                    is_infantry_man = true;
                    break;
                }
                case 90: {
                    player_caste = castes[26];
                    System.out.println("You are a " + player_caste);
                    is_infantry_man = true;
                    break;
                }
                case 91: {
                    player_caste = castes[27];
                    System.out.println("You are a " + player_caste);
                    is_calvary = true;
                    break;
                }
                case 92: {
                    player_caste = castes[27];
                    System.out.println("You are a " + player_caste);
                    is_calvary = true;
                    break;
                }
                case 93: {
                    player_caste = castes[28];
                    System.out.println("You are a " + player_caste);
                    is_mercenary = true;
                    break;
                }
                case 94: {
                    player_caste = castes[28];
                    System.out.println("You are a " + player_caste);
                    is_mercenary = true;
                    break;
                }
                case 95: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 96: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 97: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 98: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 99: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 100: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
            }

        }else if(is_bioreplica_clerical){
            switch(caste){
                case 1: {
                    player_caste = castes[0];
                    System.out.println("You are a " + player_caste);
                    is_slave_labor = true;
                    break;
                }
                case 2: {
                    player_caste = castes[1];
                    System.out.println("You are a " + player_caste);
                    is_slave_kitchen = true;
                    break;
                }
                case 3: {
                    player_caste = castes[2];
                    System.out.println("You are a " + player_caste);
                    is_slave_servant = true;
                    break;
                }
                case 4: {
                    player_caste = castes[3];
                    System.out.println("You are a " + player_caste);
                    is_slave_whore = true;
                    break;
                }
                case 5: {
                    player_caste = castes[4];
                    System.out.println("You are a " + player_caste);
                    is_slave_court = true;
                    break;
                }
                case 6: {
                    player_caste = castes[5];
                    System.out.println("You are a " + player_caste);
                    is_slave_gladiator = true;
                    break;
                }
                case 7: {
                    player_caste = castes[6];
                    System.out.println("You are a " + player_caste);
                    is_fisher = true;
                    break;
                }
                case 8: {
                    player_caste = castes[6];
                    System.out.println("You are a " + player_caste);
                    is_fisher = true;
                    break;
                }
                case 9: {
                    player_caste = castes[7];
                    System.out.println("You are a " + player_caste);
                    is_hunter = true;
                    break;
                }
                case 10: {
                    player_caste = castes[7];
                    System.out.println("You are a " + player_caste);
                    is_hunter = true;
                    break;
                }
                case 11: {
                    player_caste = castes[8];
                    System.out.println("You are a " + player_caste);
                    is_miner = true;
                    break;
                }
                case 12: {
                    player_caste = castes[8];
                    System.out.println("You are a " + player_caste);
                    is_miner = true;
                    break;
                }
                case 13: {
                    player_caste = castes[9];
                    System.out.println("You are a " + player_caste);
                    is_logger = true;
                    break;
                }
                case 14: {
                    player_caste = castes[9];
                    System.out.println("You are a " + player_caste);
                    is_logger = true;
                    break;
                }
                case 15: {
                    player_caste = castes[10];
                    System.out.println("You are a " + player_caste);
                    is_farmer = true;
                    break;
                }
                case 16: {
                    player_caste = castes[10];
                    System.out.println("You are a " + player_caste);
                    is_farmer = true;
                    break;
                }
                case 17: {
                    player_caste = castes[11];
                    System.out.println("You are a " + player_caste);
                    is_nomad = true;
                    break;
                }
                case 18: {
                    player_caste = castes[11];
                    System.out.println("You are a " + player_caste);
                    is_nomad = true;
                    break;
                }
                case 19: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 20: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 21: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 22: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 23: {
                    player_caste = castes[13];
                    System.out.println("You are a " + player_caste);
                    is_crafts_person = true;
                    break;
                }
                case 24: {
                    player_caste = castes[13];
                    System.out.println("You are a " + player_caste);
                    is_crafts_person = true;
                    break;
                }
                case 25: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 26: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 27: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 28: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 29: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 30: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 31: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 32: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 33: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 34: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 35: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 36: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 37: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 38: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 39: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 40: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 41: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 42: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 43: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 44: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 45: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 46: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 47: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 48: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 49: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 50: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 51: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 52: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 53: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 54: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 55: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 56: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 57: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 58: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 59: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 60: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 61: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 62: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 63: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 64: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 65: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 66: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 67: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 68: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 69: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 70: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 71: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 72: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 74: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 75: {
                    player_caste = castes[17];
                    System.out.println("You are a " + player_caste);
                    is_street_urchin = true;
                    break;
                }
                case 76: {
                    player_caste = castes[18];
                    System.out.println("You are a " + player_caste);
                    is_street_thug = true;
                    break;
                }
                case 77: {
                    player_caste = castes[19];
                    System.out.println("You are a " + player_caste);
                    is_raider = true;
                    break;
                }
                case 78: {
                    player_caste = castes[20];
                    System.out.println("You are a " + player_caste);
                    is_pirate = true;
                    break;
                }
                case 79: {
                    player_caste = castes[21];
                    System.out.println("You are a " + player_caste);
                    is_thief = true;
                    break;
                }
                case 80: {
                    player_caste = castes[21];
                    System.out.println("You are a " + player_caste);
                    is_thief = true;
                    break;
                }
                case 81: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 82: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 83: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 84: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 85: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 86: {
                    player_caste = castes[23];
                    System.out.println("You are a " + player_caste);
                    is_draftee = true;
                    break;
                }
                case 87: {
                    player_caste = castes[24];
                    System.out.println("You are a " + player_caste);
                    is_militia_soldier = true;
                    break;
                }
                case 88: {
                    player_caste = castes[25];
                    System.out.println("You are a " + player_caste);
                    is_watchman = true;
                    break;
                }
                case 89: {
                    player_caste = castes[26];
                    System.out.println("You are a " + player_caste);
                    is_infantry_man = true;
                    break;
                }
                case 90: {
                    player_caste = castes[26];
                    System.out.println("You are a " + player_caste);
                    is_infantry_man = true;
                    break;
                }
                case 91: {
                    player_caste = castes[27];
                    System.out.println("You are a " + player_caste);
                    is_calvary = true;
                    break;
                }
                case 92: {
                    player_caste = castes[27];
                    System.out.println("You are a " + player_caste);
                    is_calvary = true;
                    break;
                }
                case 93: {
                    player_caste = castes[28];
                    System.out.println("You are a " + player_caste);
                    is_mercenary = true;
                    break;
                }
                case 94: {
                    player_caste = castes[28];
                    System.out.println("You are a " + player_caste);
                    is_mercenary = true;
                    break;
                }
                case 95: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 96: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 97: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 98: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 99: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 100: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
            }

        }else if(is_bioreplica_infiltration){
            switch(caste){
                case 1: {
                    player_caste = castes[0];
                    System.out.println("You are a " + player_caste);
                    is_slave_labor = true;
                    break;
                }
                case 2: {
                    player_caste = castes[1];
                    System.out.println("You are a " + player_caste);
                    is_slave_kitchen = true;
                    break;
                }
                case 3: {
                    player_caste = castes[2];
                    System.out.println("You are a " + player_caste);
                    is_slave_servant = true;
                    break;
                }
                case 4: {
                    player_caste = castes[3];
                    System.out.println("You are a " + player_caste);
                    is_slave_whore = true;
                    break;
                }
                case 5: {
                    player_caste = castes[4];
                    System.out.println("You are a " + player_caste);
                    is_slave_court = true;
                    break;
                }
                case 6: {
                    player_caste = castes[5];
                    System.out.println("You are a " + player_caste);
                    is_slave_gladiator = true;
                    break;
                }
                case 7: {
                    player_caste = castes[6];
                    System.out.println("You are a " + player_caste);
                    is_fisher = true;
                    break;
                }
                case 8: {
                    player_caste = castes[6];
                    System.out.println("You are a " + player_caste);
                    is_fisher = true;
                    break;
                }
                case 9: {
                    player_caste = castes[7];
                    System.out.println("You are a " + player_caste);
                    is_hunter = true;
                    break;
                }
                case 10: {
                    player_caste = castes[7];
                    System.out.println("You are a " + player_caste);
                    is_hunter = true;
                    break;
                }
                case 11: {
                    player_caste = castes[8];
                    System.out.println("You are a " + player_caste);
                    is_miner = true;
                    break;
                }
                case 12: {
                    player_caste = castes[8];
                    System.out.println("You are a " + player_caste);
                    is_miner = true;
                    break;
                }
                case 13: {
                    player_caste = castes[9];
                    System.out.println("You are a " + player_caste);
                    is_logger = true;
                    break;
                }
                case 14: {
                    player_caste = castes[9];
                    System.out.println("You are a " + player_caste);
                    is_logger = true;
                    break;
                }
                case 15: {
                    player_caste = castes[10];
                    System.out.println("You are a " + player_caste);
                    is_farmer = true;
                    break;
                }
                case 16: {
                    player_caste = castes[10];
                    System.out.println("You are a " + player_caste);
                    is_farmer = true;
                    break;
                }
                case 17: {
                    player_caste = castes[11];
                    System.out.println("You are a " + player_caste);
                    is_nomad = true;
                    break;
                }
                case 18: {
                    player_caste = castes[11];
                    System.out.println("You are a " + player_caste);
                    is_nomad = true;
                    break;
                }
                case 19: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 20: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 21: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 22: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 23: {
                    player_caste = castes[13];
                    System.out.println("You are a " + player_caste);
                    is_crafts_person = true;
                    break;
                }
                case 24: {
                    player_caste = castes[13];
                    System.out.println("You are a " + player_caste);
                    is_crafts_person = true;
                    break;
                }
                case 25: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 26: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 27: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 28: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 29: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 30: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 31: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 32: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 33: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 34: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 35: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 36: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 37: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 38: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 39: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 40: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 41: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 42: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 43: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 44: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 45: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 46: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 47: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 48: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 49: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 50: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 51: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 52: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 53: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 54: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 55: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 56: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 57: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 58: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 59: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 60: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 61: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 62: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 63: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 64: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 65: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 66: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 67: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 68: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 69: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 70: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 71: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 72: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 74: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 75: {
                    player_caste = castes[17];
                    System.out.println("You are a " + player_caste);
                    is_street_urchin = true;
                    break;
                }
                case 76: {
                    player_caste = castes[18];
                    System.out.println("You are a " + player_caste);
                    is_street_thug = true;
                    break;
                }
                case 77: {
                    player_caste = castes[19];
                    System.out.println("You are a " + player_caste);
                    is_raider = true;
                    break;
                }
                case 78: {
                    player_caste = castes[20];
                    System.out.println("You are a " + player_caste);
                    is_pirate = true;
                    break;
                }
                case 79: {
                    player_caste = castes[21];
                    System.out.println("You are a " + player_caste);
                    is_thief = true;
                    break;
                }
                case 80: {
                    player_caste = castes[21];
                    System.out.println("You are a " + player_caste);
                    is_thief = true;
                    break;
                }
                case 81: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 82: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 83: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 84: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 85: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 86: {
                    player_caste = castes[23];
                    System.out.println("You are a " + player_caste);
                    is_draftee = true;
                    break;
                }
                case 87: {
                    player_caste = castes[24];
                    System.out.println("You are a " + player_caste);
                    is_militia_soldier = true;
                    break;
                }
                case 88: {
                    player_caste = castes[25];
                    System.out.println("You are a " + player_caste);
                    is_watchman = true;
                    break;
                }
                case 89: {
                    player_caste = castes[26];
                    System.out.println("You are a " + player_caste);
                    is_infantry_man = true;
                    break;
                }
                case 90: {
                    player_caste = castes[26];
                    System.out.println("You are a " + player_caste);
                    is_infantry_man = true;
                    break;
                }
                case 91: {
                    player_caste = castes[27];
                    System.out.println("You are a " + player_caste);
                    is_calvary = true;
                    break;
                }
                case 92: {
                    player_caste = castes[27];
                    System.out.println("You are a " + player_caste);
                    is_calvary = true;
                    break;
                }
                case 93: {
                    player_caste = castes[28];
                    System.out.println("You are a " + player_caste);
                    is_mercenary = true;
                    break;
                }
                case 94: {
                    player_caste = castes[28];
                    System.out.println("You are a " + player_caste);
                    is_mercenary = true;
                    break;
                }
                case 95: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 96: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 97: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 98: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 99: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 100: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
            }

        }else if(is_bioreplica_battle){
            switch(caste){
                case 1: {
                    player_caste = castes[0];
                    System.out.println("You are a " + player_caste);
                    is_slave_labor = true;
                    break;
                }
                case 2: {
                    player_caste = castes[1];
                    System.out.println("You are a " + player_caste);
                    is_slave_kitchen = true;
                    break;
                }
                case 3: {
                    player_caste = castes[2];
                    System.out.println("You are a " + player_caste);
                    is_slave_servant = true;
                    break;
                }
                case 4: {
                    player_caste = castes[3];
                    System.out.println("You are a " + player_caste);
                    is_slave_whore = true;
                    break;
                }
                case 5: {
                    player_caste = castes[4];
                    System.out.println("You are a " + player_caste);
                    is_slave_court = true;
                    break;
                }
                case 6: {
                    player_caste = castes[5];
                    System.out.println("You are a " + player_caste);
                    is_slave_gladiator = true;
                    break;
                }
                case 7: {
                    player_caste = castes[6];
                    System.out.println("You are a " + player_caste);
                    is_fisher = true;
                    break;
                }
                case 8: {
                    player_caste = castes[6];
                    System.out.println("You are a " + player_caste);
                    is_fisher = true;
                    break;
                }
                case 9: {
                    player_caste = castes[7];
                    System.out.println("You are a " + player_caste);
                    is_hunter = true;
                    break;
                }
                case 10: {
                    player_caste = castes[7];
                    System.out.println("You are a " + player_caste);
                    is_hunter = true;
                    break;
                }
                case 11: {
                    player_caste = castes[8];
                    System.out.println("You are a " + player_caste);
                    is_miner = true;
                    break;
                }
                case 12: {
                    player_caste = castes[8];
                    System.out.println("You are a " + player_caste);
                    is_miner = true;
                    break;
                }
                case 13: {
                    player_caste = castes[9];
                    System.out.println("You are a " + player_caste);
                    is_logger = true;
                    break;
                }
                case 14: {
                    player_caste = castes[9];
                    System.out.println("You are a " + player_caste);
                    is_logger = true;
                    break;
                }
                case 15: {
                    player_caste = castes[10];
                    System.out.println("You are a " + player_caste);
                    is_farmer = true;
                    break;
                }
                case 16: {
                    player_caste = castes[10];
                    System.out.println("You are a " + player_caste);
                    is_farmer = true;
                    break;
                }
                case 17: {
                    player_caste = castes[11];
                    System.out.println("You are a " + player_caste);
                    is_nomad = true;
                    break;
                }
                case 18: {
                    player_caste = castes[11];
                    System.out.println("You are a " + player_caste);
                    is_nomad = true;
                    break;
                }
                case 19: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 20: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 21: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 22: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 23: {
                    player_caste = castes[13];
                    System.out.println("You are a " + player_caste);
                    is_crafts_person = true;
                    break;
                }
                case 24: {
                    player_caste = castes[13];
                    System.out.println("You are a " + player_caste);
                    is_crafts_person = true;
                    break;
                }
                case 25: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 26: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 27: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 28: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 29: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 30: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 31: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 32: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 33: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 34: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 35: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 36: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 37: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 38: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 39: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 40: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 41: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 42: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 43: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 44: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 45: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 46: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 47: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 48: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 49: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 50: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 51: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 52: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 53: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 54: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 55: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 56: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 57: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 58: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 59: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 60: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 61: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 62: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 63: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 64: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 65: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 66: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 67: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 68: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 69: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 70: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 71: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 72: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 74: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 75: {
                    player_caste = castes[17];
                    System.out.println("You are a " + player_caste);
                    is_street_urchin = true;
                    break;
                }
                case 76: {
                    player_caste = castes[18];
                    System.out.println("You are a " + player_caste);
                    is_street_thug = true;
                    break;
                }
                case 77: {
                    player_caste = castes[19];
                    System.out.println("You are a " + player_caste);
                    is_raider = true;
                    break;
                }
                case 78: {
                    player_caste = castes[20];
                    System.out.println("You are a " + player_caste);
                    is_pirate = true;
                    break;
                }
                case 79: {
                    player_caste = castes[21];
                    System.out.println("You are a " + player_caste);
                    is_thief = true;
                    break;
                }
                case 80: {
                    player_caste = castes[21];
                    System.out.println("You are a " + player_caste);
                    is_thief = true;
                    break;
                }
                case 81: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 82: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 83: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 84: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 85: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 86: {
                    player_caste = castes[23];
                    System.out.println("You are a " + player_caste);
                    is_draftee = true;
                    break;
                }
                case 87: {
                    player_caste = castes[24];
                    System.out.println("You are a " + player_caste);
                    is_militia_soldier = true;
                    break;
                }
                case 88: {
                    player_caste = castes[25];
                    System.out.println("You are a " + player_caste);
                    is_watchman = true;
                    break;
                }
                case 89: {
                    player_caste = castes[26];
                    System.out.println("You are a " + player_caste);
                    is_infantry_man = true;
                    break;
                }
                case 90: {
                    player_caste = castes[26];
                    System.out.println("You are a " + player_caste);
                    is_infantry_man = true;
                    break;
                }
                case 91: {
                    player_caste = castes[27];
                    System.out.println("You are a " + player_caste);
                    is_calvary = true;
                    break;
                }
                case 92: {
                    player_caste = castes[27];
                    System.out.println("You are a " + player_caste);
                    is_calvary = true;
                    break;
                }
                case 93: {
                    player_caste = castes[28];
                    System.out.println("You are a " + player_caste);
                    is_mercenary = true;
                    break;
                }
                case 94: {
                    player_caste = castes[28];
                    System.out.println("You are a " + player_caste);
                    is_mercenary = true;
                    break;
                }
                case 95: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 96: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 97: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 98: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 99: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 100: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
            }

        }else if(is_trans_human){
            switch(caste){
                case 1: {
                    player_caste = castes[0];
                    System.out.println("You are a " + player_caste);
                    is_slave_labor = true;
                    break;
                }
                case 2: {
                    player_caste = castes[1];
                    System.out.println("You are a " + player_caste);
                    is_slave_kitchen = true;
                    break;
                }
                case 3: {
                    player_caste = castes[2];
                    System.out.println("You are a " + player_caste);
                    is_slave_servant = true;
                    break;
                }
                case 4: {
                    player_caste = castes[3];
                    System.out.println("You are a " + player_caste);
                    is_slave_whore = true;
                    break;
                }
                case 5: {
                    player_caste = castes[4];
                    System.out.println("You are a " + player_caste);
                    is_slave_court = true;
                    break;
                }
                case 6: {
                    player_caste = castes[5];
                    System.out.println("You are a " + player_caste);
                    is_slave_gladiator = true;
                    break;
                }
                case 7: {
                    player_caste = castes[6];
                    System.out.println("You are a " + player_caste);
                    is_fisher = true;
                    break;
                }
                case 8: {
                    player_caste = castes[6];
                    System.out.println("You are a " + player_caste);
                    is_fisher = true;
                    break;
                }
                case 9: {
                    player_caste = castes[7];
                    System.out.println("You are a " + player_caste);
                    is_hunter = true;
                    break;
                }
                case 10: {
                    player_caste = castes[7];
                    System.out.println("You are a " + player_caste);
                    is_hunter = true;
                    break;
                }
                case 11: {
                    player_caste = castes[8];
                    System.out.println("You are a " + player_caste);
                    is_miner = true;
                    break;
                }
                case 12: {
                    player_caste = castes[8];
                    System.out.println("You are a " + player_caste);
                    is_miner = true;
                    break;
                }
                case 13: {
                    player_caste = castes[9];
                    System.out.println("You are a " + player_caste);
                    is_logger = true;
                    break;
                }
                case 14: {
                    player_caste = castes[9];
                    System.out.println("You are a " + player_caste);
                    is_logger = true;
                    break;
                }
                case 15: {
                    player_caste = castes[10];
                    System.out.println("You are a " + player_caste);
                    is_farmer = true;
                    break;
                }
                case 16: {
                    player_caste = castes[10];
                    System.out.println("You are a " + player_caste);
                    is_farmer = true;
                    break;
                }
                case 17: {
                    player_caste = castes[11];
                    System.out.println("You are a " + player_caste);
                    is_nomad = true;
                    break;
                }
                case 18: {
                    player_caste = castes[11];
                    System.out.println("You are a " + player_caste);
                    is_nomad = true;
                    break;
                }
                case 19: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 20: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 21: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 22: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 23: {
                    player_caste = castes[13];
                    System.out.println("You are a " + player_caste);
                    is_crafts_person = true;
                    break;
                }
                case 24: {
                    player_caste = castes[13];
                    System.out.println("You are a " + player_caste);
                    is_crafts_person = true;
                    break;
                }
                case 25: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 26: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 27: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 28: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 29: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 30: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 31: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 32: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 33: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 34: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 35: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 36: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 37: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 38: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 39: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 40: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 41: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 42: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 43: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 44: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 45: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 46: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 47: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 48: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 49: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 50: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 51: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 52: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 53: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 54: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 55: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 56: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 57: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 58: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 59: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 60: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 61: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 62: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 63: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 64: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 65: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 66: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 67: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 68: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 69: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 70: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 71: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 72: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 74: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 75: {
                    player_caste = castes[17];
                    System.out.println("You are a " + player_caste);
                    is_street_urchin = true;
                    break;
                }
                case 76: {
                    player_caste = castes[18];
                    System.out.println("You are a " + player_caste);
                    is_street_thug = true;
                    break;
                }
                case 77: {
                    player_caste = castes[19];
                    System.out.println("You are a " + player_caste);
                    is_raider = true;
                    break;
                }
                case 78: {
                    player_caste = castes[20];
                    System.out.println("You are a " + player_caste);
                    is_pirate = true;
                    break;
                }
                case 79: {
                    player_caste = castes[21];
                    System.out.println("You are a " + player_caste);
                    is_thief = true;
                    break;
                }
                case 80: {
                    player_caste = castes[21];
                    System.out.println("You are a " + player_caste);
                    is_thief = true;
                    break;
                }
                case 81: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 82: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 83: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 84: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 85: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 86: {
                    player_caste = castes[23];
                    System.out.println("You are a " + player_caste);
                    is_draftee = true;
                    break;
                }
                case 87: {
                    player_caste = castes[24];
                    System.out.println("You are a " + player_caste);
                    is_militia_soldier = true;
                    break;
                }
                case 88: {
                    player_caste = castes[25];
                    System.out.println("You are a " + player_caste);
                    is_watchman = true;
                    break;
                }
                case 89: {
                    player_caste = castes[26];
                    System.out.println("You are a " + player_caste);
                    is_infantry_man = true;
                    break;
                }
                case 90: {
                    player_caste = castes[26];
                    System.out.println("You are a " + player_caste);
                    is_infantry_man = true;
                    break;
                }
                case 91: {
                    player_caste = castes[27];
                    System.out.println("You are a " + player_caste);
                    is_calvary = true;
                    break;
                }
                case 92: {
                    player_caste = castes[27];
                    System.out.println("You are a " + player_caste);
                    is_calvary = true;
                    break;
                }
                case 93: {
                    player_caste = castes[28];
                    System.out.println("You are a " + player_caste);
                    is_mercenary = true;
                    break;
                }
                case 94: {
                    player_caste = castes[28];
                    System.out.println("You are a " + player_caste);
                    is_mercenary = true;
                    break;
                }
                case 95: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 96: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 97: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 98: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 99: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 100: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
            }

        }else if(is_cyborg){
            switch(caste){
                case 1: {
                    player_caste = castes[0];
                    System.out.println("You are a " + player_caste);
                    is_slave_labor = true;
                    break;
                }
                case 2: {
                    player_caste = castes[1];
                    System.out.println("You are a " + player_caste);
                    is_slave_kitchen = true;
                    break;
                }
                case 3: {
                    player_caste = castes[2];
                    System.out.println("You are a " + player_caste);
                    is_slave_servant = true;
                    break;
                }
                case 4: {
                    player_caste = castes[3];
                    System.out.println("You are a " + player_caste);
                    is_slave_whore = true;
                    break;
                }
                case 5: {
                    player_caste = castes[4];
                    System.out.println("You are a " + player_caste);
                    is_slave_court = true;
                    break;
                }
                case 6: {
                    player_caste = castes[5];
                    System.out.println("You are a " + player_caste);
                    is_slave_gladiator = true;
                    break;
                }
                case 7: {
                    player_caste = castes[6];
                    System.out.println("You are a " + player_caste);
                    is_fisher = true;
                    break;
                }
                case 8: {
                    player_caste = castes[6];
                    System.out.println("You are a " + player_caste);
                    is_fisher = true;
                    break;
                }
                case 9: {
                    player_caste = castes[7];
                    System.out.println("You are a " + player_caste);
                    is_hunter = true;
                    break;
                }
                case 10: {
                    player_caste = castes[7];
                    System.out.println("You are a " + player_caste);
                    is_hunter = true;
                    break;
                }
                case 11: {
                    player_caste = castes[8];
                    System.out.println("You are a " + player_caste);
                    is_miner = true;
                    break;
                }
                case 12: {
                    player_caste = castes[8];
                    System.out.println("You are a " + player_caste);
                    is_miner = true;
                    break;
                }
                case 13: {
                    player_caste = castes[9];
                    System.out.println("You are a " + player_caste);
                    is_logger = true;
                    break;
                }
                case 14: {
                    player_caste = castes[9];
                    System.out.println("You are a " + player_caste);
                    is_logger = true;
                    break;
                }
                case 15: {
                    player_caste = castes[10];
                    System.out.println("You are a " + player_caste);
                    is_farmer = true;
                    break;
                }
                case 16: {
                    player_caste = castes[10];
                    System.out.println("You are a " + player_caste);
                    is_farmer = true;
                    break;
                }
                case 17: {
                    player_caste = castes[11];
                    System.out.println("You are a " + player_caste);
                    is_nomad = true;
                    break;
                }
                case 18: {
                    player_caste = castes[11];
                    System.out.println("You are a " + player_caste);
                    is_nomad = true;
                    break;
                }
                case 19: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 20: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 21: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 22: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 23: {
                    player_caste = castes[13];
                    System.out.println("You are a " + player_caste);
                    is_crafts_person = true;
                    break;
                }
                case 24: {
                    player_caste = castes[13];
                    System.out.println("You are a " + player_caste);
                    is_crafts_person = true;
                    break;
                }
                case 25: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 26: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 27: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 28: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 29: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 30: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 31: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 32: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 33: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 34: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 35: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 36: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 37: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 38: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 39: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 40: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 41: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 42: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 43: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 44: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 45: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 46: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 47: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 48: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 49: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 50: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 51: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 52: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 53: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 54: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 55: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 56: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 57: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 58: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 59: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 60: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 61: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 62: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 63: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 64: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 65: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 66: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 67: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 68: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 69: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 70: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 71: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 72: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 74: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 75: {
                    player_caste = castes[17];
                    System.out.println("You are a " + player_caste);
                    is_street_urchin = true;
                    break;
                }
                case 76: {
                    player_caste = castes[18];
                    System.out.println("You are a " + player_caste);
                    is_street_thug = true;
                    break;
                }
                case 77: {
                    player_caste = castes[19];
                    System.out.println("You are a " + player_caste);
                    is_raider = true;
                    break;
                }
                case 78: {
                    player_caste = castes[20];
                    System.out.println("You are a " + player_caste);
                    is_pirate = true;
                    break;
                }
                case 79: {
                    player_caste = castes[21];
                    System.out.println("You are a " + player_caste);
                    is_thief = true;
                    break;
                }
                case 80: {
                    player_caste = castes[21];
                    System.out.println("You are a " + player_caste);
                    is_thief = true;
                    break;
                }
                case 81: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 82: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 83: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 84: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 85: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 86: {
                    player_caste = castes[23];
                    System.out.println("You are a " + player_caste);
                    is_draftee = true;
                    break;
                }
                case 87: {
                    player_caste = castes[24];
                    System.out.println("You are a " + player_caste);
                    is_militia_soldier = true;
                    break;
                }
                case 88: {
                    player_caste = castes[25];
                    System.out.println("You are a " + player_caste);
                    is_watchman = true;
                    break;
                }
                case 89: {
                    player_caste = castes[26];
                    System.out.println("You are a " + player_caste);
                    is_infantry_man = true;
                    break;
                }
                case 90: {
                    player_caste = castes[26];
                    System.out.println("You are a " + player_caste);
                    is_infantry_man = true;
                    break;
                }
                case 91: {
                    player_caste = castes[27];
                    System.out.println("You are a " + player_caste);
                    is_calvary = true;
                    break;
                }
                case 92: {
                    player_caste = castes[27];
                    System.out.println("You are a " + player_caste);
                    is_calvary = true;
                    break;
                }
                case 93: {
                    player_caste = castes[28];
                    System.out.println("You are a " + player_caste);
                    is_mercenary = true;
                    break;
                }
                case 94: {
                    player_caste = castes[28];
                    System.out.println("You are a " + player_caste);
                    is_mercenary = true;
                    break;
                }
                case 95: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 96: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 97: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 98: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 99: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 100: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
            }

        }else if(is_bestial_human){
            switch(caste){
                case 1: {
                    player_caste = castes[0];
                    System.out.println("You are a " + player_caste);
                    is_slave_labor = true;
                    break;
                }
                case 2: {
                    player_caste = castes[1];
                    System.out.println("You are a " + player_caste);
                    is_slave_kitchen = true;
                    break;
                }
                case 3: {
                    player_caste = castes[2];
                    System.out.println("You are a " + player_caste);
                    is_slave_servant = true;
                    break;
                }
                case 4: {
                    player_caste = castes[3];
                    System.out.println("You are a " + player_caste);
                    is_slave_whore = true;
                    break;
                }
                case 5: {
                    player_caste = castes[4];
                    System.out.println("You are a " + player_caste);
                    is_slave_court = true;
                    break;
                }
                case 6: {
                    player_caste = castes[5];
                    System.out.println("You are a " + player_caste);
                    is_slave_gladiator = true;
                    break;
                }
                case 7: {
                    player_caste = castes[6];
                    System.out.println("You are a " + player_caste);
                    is_fisher = true;
                    break;
                }
                case 8: {
                    player_caste = castes[6];
                    System.out.println("You are a " + player_caste);
                    is_fisher = true;
                    break;
                }
                case 9: {
                    player_caste = castes[7];
                    System.out.println("You are a " + player_caste);
                    is_hunter = true;
                    break;
                }
                case 10: {
                    player_caste = castes[7];
                    System.out.println("You are a " + player_caste);
                    is_hunter = true;
                    break;
                }
                case 11: {
                    player_caste = castes[8];
                    System.out.println("You are a " + player_caste);
                    is_miner = true;
                    break;
                }
                case 12: {
                    player_caste = castes[8];
                    System.out.println("You are a " + player_caste);
                    is_miner = true;
                    break;
                }
                case 13: {
                    player_caste = castes[9];
                    System.out.println("You are a " + player_caste);
                    is_logger = true;
                    break;
                }
                case 14: {
                    player_caste = castes[9];
                    System.out.println("You are a " + player_caste);
                    is_logger = true;
                    break;
                }
                case 15: {
                    player_caste = castes[10];
                    System.out.println("You are a " + player_caste);
                    is_farmer = true;
                    break;
                }
                case 16: {
                    player_caste = castes[10];
                    System.out.println("You are a " + player_caste);
                    is_farmer = true;
                    break;
                }
                case 17: {
                    player_caste = castes[11];
                    System.out.println("You are a " + player_caste);
                    is_nomad = true;
                    break;
                }
                case 18: {
                    player_caste = castes[11];
                    System.out.println("You are a " + player_caste);
                    is_nomad = true;
                    break;
                }
                case 19: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 20: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 21: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 22: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 23: {
                    player_caste = castes[13];
                    System.out.println("You are a " + player_caste);
                    is_crafts_person = true;
                    break;
                }
                case 24: {
                    player_caste = castes[13];
                    System.out.println("You are a " + player_caste);
                    is_crafts_person = true;
                    break;
                }
                case 25: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 26: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 27: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 28: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 29: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 30: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 31: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 32: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 33: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 34: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 35: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 36: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 37: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 38: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 39: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 40: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 41: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 42: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 43: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 44: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 45: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 46: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 47: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 48: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 49: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 50: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 51: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 52: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 53: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 54: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 55: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 56: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 57: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 58: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 59: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 60: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 61: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 62: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 63: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 64: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 65: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 66: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 67: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 68: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 69: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 70: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 71: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 72: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 74: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 75: {
                    player_caste = castes[17];
                    System.out.println("You are a " + player_caste);
                    is_street_urchin = true;
                    break;
                }
                case 76: {
                    player_caste = castes[18];
                    System.out.println("You are a " + player_caste);
                    is_street_thug = true;
                    break;
                }
                case 77: {
                    player_caste = castes[19];
                    System.out.println("You are a " + player_caste);
                    is_raider = true;
                    break;
                }
                case 78: {
                    player_caste = castes[20];
                    System.out.println("You are a " + player_caste);
                    is_pirate = true;
                    break;
                }
                case 79: {
                    player_caste = castes[21];
                    System.out.println("You are a " + player_caste);
                    is_thief = true;
                    break;
                }
                case 80: {
                    player_caste = castes[21];
                    System.out.println("You are a " + player_caste);
                    is_thief = true;
                    break;
                }
                case 81: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 82: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 83: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 84: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 85: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 86: {
                    player_caste = castes[23];
                    System.out.println("You are a " + player_caste);
                    is_draftee = true;
                    break;
                }
                case 87: {
                    player_caste = castes[24];
                    System.out.println("You are a " + player_caste);
                    is_militia_soldier = true;
                    break;
                }
                case 88: {
                    player_caste = castes[25];
                    System.out.println("You are a " + player_caste);
                    is_watchman = true;
                    break;
                }
                case 89: {
                    player_caste = castes[26];
                    System.out.println("You are a " + player_caste);
                    is_infantry_man = true;
                    break;
                }
                case 90: {
                    player_caste = castes[26];
                    System.out.println("You are a " + player_caste);
                    is_infantry_man = true;
                    break;
                }
                case 91: {
                    player_caste = castes[27];
                    System.out.println("You are a " + player_caste);
                    is_calvary = true;
                    break;
                }
                case 92: {
                    player_caste = castes[27];
                    System.out.println("You are a " + player_caste);
                    is_calvary = true;
                    break;
                }
                case 93: {
                    player_caste = castes[28];
                    System.out.println("You are a " + player_caste);
                    is_mercenary = true;
                    break;
                }
                case 94: {
                    player_caste = castes[28];
                    System.out.println("You are a " + player_caste);
                    is_mercenary = true;
                    break;
                }
                case 95: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 96: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 97: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 98: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 99: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 100: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
            }

        }else if(is_ghost_mutant){
            switch(caste){
                case 1: {
                    player_caste = castes[0];
                    System.out.println("You are a " + player_caste);
                    is_slave_labor = true;
                    break;
                }
                case 2: {
                    player_caste = castes[1];
                    System.out.println("You are a " + player_caste);
                    is_slave_kitchen = true;
                    break;
                }
                case 3: {
                    player_caste = castes[2];
                    System.out.println("You are a " + player_caste);
                    is_slave_servant = true;
                    break;
                }
                case 4: {
                    player_caste = castes[3];
                    System.out.println("You are a " + player_caste);
                    is_slave_whore = true;
                    break;
                }
                case 5: {
                    player_caste = castes[4];
                    System.out.println("You are a " + player_caste);
                    is_slave_court = true;
                    break;
                }
                case 6: {
                    player_caste = castes[5];
                    System.out.println("You are a " + player_caste);
                    is_slave_gladiator = true;
                    break;
                }
                case 7: {
                    player_caste = castes[6];
                    System.out.println("You are a " + player_caste);
                    is_fisher = true;
                    break;
                }
                case 8: {
                    player_caste = castes[6];
                    System.out.println("You are a " + player_caste);
                    is_fisher = true;
                    break;
                }
                case 9: {
                    player_caste = castes[7];
                    System.out.println("You are a " + player_caste);
                    is_hunter = true;
                    break;
                }
                case 10: {
                    player_caste = castes[7];
                    System.out.println("You are a " + player_caste);
                    is_hunter = true;
                    break;
                }
                case 11: {
                    player_caste = castes[8];
                    System.out.println("You are a " + player_caste);
                    is_miner = true;
                    break;
                }
                case 12: {
                    player_caste = castes[8];
                    System.out.println("You are a " + player_caste);
                    is_miner = true;
                    break;
                }
                case 13: {
                    player_caste = castes[9];
                    System.out.println("You are a " + player_caste);
                    is_logger = true;
                    break;
                }
                case 14: {
                    player_caste = castes[9];
                    System.out.println("You are a " + player_caste);
                    is_logger = true;
                    break;
                }
                case 15: {
                    player_caste = castes[10];
                    System.out.println("You are a " + player_caste);
                    is_farmer = true;
                    break;
                }
                case 16: {
                    player_caste = castes[10];
                    System.out.println("You are a " + player_caste);
                    is_farmer = true;
                    break;
                }
                case 17: {
                    player_caste = castes[11];
                    System.out.println("You are a " + player_caste);
                    is_nomad = true;
                    break;
                }
                case 18: {
                    player_caste = castes[11];
                    System.out.println("You are a " + player_caste);
                    is_nomad = true;
                    break;
                }
                case 19: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 20: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 21: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 22: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 23: {
                    player_caste = castes[13];
                    System.out.println("You are a " + player_caste);
                    is_crafts_person = true;
                    break;
                }
                case 24: {
                    player_caste = castes[13];
                    System.out.println("You are a " + player_caste);
                    is_crafts_person = true;
                    break;
                }
                case 25: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 26: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 27: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 28: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 29: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 30: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 31: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 32: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 33: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 34: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 35: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 36: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 37: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 38: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 39: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 40: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 41: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 42: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 43: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 44: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 45: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 46: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 47: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 48: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 49: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 50: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 51: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 52: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 53: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 54: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 55: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 56: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 57: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 58: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 59: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 60: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 61: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 62: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 63: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 64: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 65: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 66: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 67: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 68: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 69: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 70: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 71: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 72: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 74: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 75: {
                    player_caste = castes[17];
                    System.out.println("You are a " + player_caste);
                    is_street_urchin = true;
                    break;
                }
                case 76: {
                    player_caste = castes[18];
                    System.out.println("You are a " + player_caste);
                    is_street_thug = true;
                    break;
                }
                case 77: {
                    player_caste = castes[19];
                    System.out.println("You are a " + player_caste);
                    is_raider = true;
                    break;
                }
                case 78: {
                    player_caste = castes[20];
                    System.out.println("You are a " + player_caste);
                    is_pirate = true;
                    break;
                }
                case 79: {
                    player_caste = castes[21];
                    System.out.println("You are a " + player_caste);
                    is_thief = true;
                    break;
                }
                case 80: {
                    player_caste = castes[21];
                    System.out.println("You are a " + player_caste);
                    is_thief = true;
                    break;
                }
                case 81: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 82: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 83: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 84: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 85: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 86: {
                    player_caste = castes[23];
                    System.out.println("You are a " + player_caste);
                    is_draftee = true;
                    break;
                }
                case 87: {
                    player_caste = castes[24];
                    System.out.println("You are a " + player_caste);
                    is_militia_soldier = true;
                    break;
                }
                case 88: {
                    player_caste = castes[25];
                    System.out.println("You are a " + player_caste);
                    is_watchman = true;
                    break;
                }
                case 89: {
                    player_caste = castes[26];
                    System.out.println("You are a " + player_caste);
                    is_infantry_man = true;
                    break;
                }
                case 90: {
                    player_caste = castes[26];
                    System.out.println("You are a " + player_caste);
                    is_infantry_man = true;
                    break;
                }
                case 91: {
                    player_caste = castes[27];
                    System.out.println("You are a " + player_caste);
                    is_calvary = true;
                    break;
                }
                case 92: {
                    player_caste = castes[27];
                    System.out.println("You are a " + player_caste);
                    is_calvary = true;
                    break;
                }
                case 93: {
                    player_caste = castes[28];
                    System.out.println("You are a " + player_caste);
                    is_mercenary = true;
                    break;
                }
                case 94: {
                    player_caste = castes[28];
                    System.out.println("You are a " + player_caste);
                    is_mercenary = true;
                    break;
                }
                case 95: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 96: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 97: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 98: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 99: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 100: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
            }

        }else if(is_mutant_mild == true || is_mutant_typical == true
        || is_mutant_severe == true || is_mutant_freakish_horror == true){
            switch(caste){
                case 1: {
                    player_caste = castes[0];
                    System.out.println("You are a " + player_caste);
                    is_slave_labor = true;
                    break;
                }
                case 2: {
                    player_caste = castes[1];
                    System.out.println("You are a " + player_caste);
                    is_slave_kitchen = true;
                    break;
                }
                case 3: {
                    player_caste = castes[2];
                    System.out.println("You are a " + player_caste);
                    is_slave_servant = true;
                    break;
                }
                case 4: {
                    player_caste = castes[3];
                    System.out.println("You are a " + player_caste);
                    is_slave_whore = true;
                    break;
                }
                case 5: {
                    player_caste = castes[4];
                    System.out.println("You are a " + player_caste);
                    is_slave_court = true;
                    break;
                }
                case 6: {
                    player_caste = castes[5];
                    System.out.println("You are a " + player_caste);
                    is_slave_gladiator = true;
                    break;
                }
                case 7: {
                    player_caste = castes[6];
                    System.out.println("You are a " + player_caste);
                    is_fisher = true;
                    break;
                }
                case 8: {
                    player_caste = castes[6];
                    System.out.println("You are a " + player_caste);
                    is_fisher = true;
                    break;
                }
                case 9: {
                    player_caste = castes[7];
                    System.out.println("You are a " + player_caste);
                    is_hunter = true;
                    break;
                }
                case 10: {
                    player_caste = castes[7];
                    System.out.println("You are a " + player_caste);
                    is_hunter = true;
                    break;
                }
                case 11: {
                    player_caste = castes[8];
                    System.out.println("You are a " + player_caste);
                    is_miner = true;
                    break;
                }
                case 12: {
                    player_caste = castes[8];
                    System.out.println("You are a " + player_caste);
                    is_miner = true;
                    break;
                }
                case 13: {
                    player_caste = castes[9];
                    System.out.println("You are a " + player_caste);
                    is_logger = true;
                    break;
                }
                case 14: {
                    player_caste = castes[9];
                    System.out.println("You are a " + player_caste);
                    is_logger = true;
                    break;
                }
                case 15: {
                    player_caste = castes[10];
                    System.out.println("You are a " + player_caste);
                    is_farmer = true;
                    break;
                }
                case 16: {
                    player_caste = castes[10];
                    System.out.println("You are a " + player_caste);
                    is_farmer = true;
                    break;
                }
                case 17: {
                    player_caste = castes[11];
                    System.out.println("You are a " + player_caste);
                    is_nomad = true;
                    break;
                }
                case 18: {
                    player_caste = castes[11];
                    System.out.println("You are a " + player_caste);
                    is_nomad = true;
                    break;
                }
                case 19: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 20: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 21: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 22: {
                    player_caste = castes[12];
                    System.out.println("You are a " + player_caste);
                    is_trader = true;
                    break;
                }
                case 23: {
                    player_caste = castes[13];
                    System.out.println("You are a " + player_caste);
                    is_crafts_person = true;
                    break;
                }
                case 24: {
                    player_caste = castes[13];
                    System.out.println("You are a " + player_caste);
                    is_crafts_person = true;
                    break;
                }
                case 25: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 26: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 27: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 28: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 29: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 30: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 31: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 32: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 33: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 34: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 35: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 36: {
                    player_caste = castes[14];
                    System.out.println("You are a " + player_caste);
                    is_student = true;
                    break;
                }
                case 37: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 38: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 39: {
                    player_caste = castes[15];
                    System.out.println("You are a " + player_caste);
                    is_scribe = true;
                    break;
                }
                case 40: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 41: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 42: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 43: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 44: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 45: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 46: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 47: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 48: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 49: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 50: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 51: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 52: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 53: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 54: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 55: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 56: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 57: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 58: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 59: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 60: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 61: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 62: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 63: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 64: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 65: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 66: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 67: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 68: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 69: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 70: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 71: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 72: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 74: {
                    player_caste = castes[16];
                    System.out.println("You are a " + player_caste);
                    is_technician = true;
                    break;
                }
                case 75: {
                    player_caste = castes[17];
                    System.out.println("You are a " + player_caste);
                    is_street_urchin = true;
                    break;
                }
                case 76: {
                    player_caste = castes[18];
                    System.out.println("You are a " + player_caste);
                    is_street_thug = true;
                    break;
                }
                case 77: {
                    player_caste = castes[19];
                    System.out.println("You are a " + player_caste);
                    is_raider = true;
                    break;
                }
                case 78: {
                    player_caste = castes[20];
                    System.out.println("You are a " + player_caste);
                    is_pirate = true;
                    break;
                }
                case 79: {
                    player_caste = castes[21];
                    System.out.println("You are a " + player_caste);
                    is_thief = true;
                    break;
                }
                case 80: {
                    player_caste = castes[21];
                    System.out.println("You are a " + player_caste);
                    is_thief = true;
                    break;
                }
                case 81: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 82: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 83: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 84: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 85: {
                    player_caste = castes[22];
                    System.out.println("You are a " + player_caste);
                    is_assassin = true;
                    break;
                }
                case 86: {
                    player_caste = castes[23];
                    System.out.println("You are a " + player_caste);
                    is_draftee = true;
                    break;
                }
                case 87: {
                    player_caste = castes[24];
                    System.out.println("You are a " + player_caste);
                    is_militia_soldier = true;
                    break;
                }
                case 88: {
                    player_caste = castes[25];
                    System.out.println("You are a " + player_caste);
                    is_watchman = true;
                    break;
                }
                case 89: {
                    player_caste = castes[26];
                    System.out.println("You are a " + player_caste);
                    is_infantry_man = true;
                    break;
                }
                case 90: {
                    player_caste = castes[26];
                    System.out.println("You are a " + player_caste);
                    is_infantry_man = true;
                    break;
                }
                case 91: {
                    player_caste = castes[27];
                    System.out.println("You are a " + player_caste);
                    is_calvary = true;
                    break;
                }
                case 92: {
                    player_caste = castes[27];
                    System.out.println("You are a " + player_caste);
                    is_calvary = true;
                    break;
                }
                case 93: {
                    player_caste = castes[28];
                    System.out.println("You are a " + player_caste);
                    is_mercenary = true;
                    break;
                }
                case 94: {
                    player_caste = castes[28];
                    System.out.println("You are a " + player_caste);
                    is_mercenary = true;
                    break;
                }
                case 95: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 96: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 97: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 98: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 99: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
                case 100: {
                    player_caste = castes[29];
                    System.out.println("You are a " + player_caste);
                    is_elite_soldier = true;
                    break;
                }
            }
        }
        return player_caste;
    }

    public static void roll_handedness(){
        int hand = d10();

        switch(hand){
            case 1, 2, 3, 4, 5, 6, 7:{
                System.out.println("You are right handed");
                break;
            }
            case 8, 9: {
                System.out.println("You are left handed");
                break;
            }
            case 10: {
                System.out.println("You are ambidextrous");
                break;
            }
        }
    }

    public static void roll_skills(){
        for(int a = 0; a < criminal_skills; a++){
            int roll = d100();
        }
        for(int b = 0; b < warrior_skills; b ++){
            int roll = d100();
        }
        for(int c = 0; c < educated_skills; c++){
            int roll = d100();
        }
        for(int d = 0; d < misc_skills; d++){
            int roll = d100();
        }
    }

    private static void roll_swimming_ability(){
        int swim = d10();
        swimming_ability = swimming_ability + swim;

        if(swimming_ability >= 10){
            System.out.println("Excellent Swimmer");
        }else if(swimming_ability == 8 || swimming_ability == 9){
            System.out.println("Strong Swimmer");
        }else if(swimming_ability == 6 || swimming_ability == 7){
            System.out.println("Fair Swimmer");
        }else if(swimming_ability == 4 || swimming_ability == 5){
            System.out.println("Poor Swimmer");
        }else{
            System.out.println("Can't Swim");
        }
    }


    public static void main(String[] args){
        //Initialize Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Please select a difficulty 1, 2, or 3");
        int x = scan.nextInt();

        System.out.println(roll_Gender());
        
        //Adjust for beginner = 1, experienced = 2, and master = 3
        //This allows you to be more likely to play certain character
        //types and/or access other types not available on other difficulties
        String character_type = Roller.rolltype(x);
        System.out.println("You are a: " + character_type);

        //Roll for Stat values.  Can adjust for 9 rolls by adding another
        //entry to the array "stats" called "9th roll".
        String[] stat_names = {"END", "STR", "AG", "ACC", "INT", "PER", "WILL", "APP"};
        int[] stats = {end, str, ag, acc, intel, per, will, app};
        for(int i = 0; i < stats.length; i++){
            stats[i] = Roller.rollstatvalue();
            System.out.println(stat_names[i] + " = " + stats[i]);
        }


        roll_caste();
        roll_skills();
        roll_handedness();
        roll_swimming_ability();
        //I still don't know 100% what closing scanner "does"
        //I just know I was told it's good practice
        scan.close();
    }
}