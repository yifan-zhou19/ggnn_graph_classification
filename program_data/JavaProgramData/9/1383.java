package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int amount_lao = 0;
		  int amount_yiban = 0;
		  String c = new String(new char[11]);
		  int shuru;
		  int i;
		  int j;
		  int k;
		  int s;
		  int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	  struct xinxi
	//	  {
	//			 char id[11];
	//			 int age;
	//	  };
		  xinxi[] laoren = tangible.Arrays.initializeWithDefaultxinxiInstances(100);
		  xinxi[] common = tangible.Arrays.initializeWithDefaultxinxiInstances(100);
		  xinxi temp = new xinxi();
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (p = 0;p < n;p++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  c = tempVar2.charAt(0);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  shuru = Integer.parseInt(tempVar3);
			  }
			  if (shuru < 60)
			  {
				  common[amount_yiban].id = c;
				  common[amount_yiban].age = shuru;
				  amount_yiban++;
			  }
			  else if (shuru >= 60)
			  {
				  laoren[amount_lao].id = c;
				  laoren[amount_lao].age = shuru;
				  amount_lao++;
			  }
		  }
		  for (i = 0;i < amount_lao - 1;i++)
		  {
			   for (j = 0;j < amount_lao - i - 1;j++)
			   {
				   if (laoren[j].age < laoren[j + 1].age)
				   {
						temp.id = laoren[j].id;
						temp.age = laoren[j].age;
						laoren[j].id = laoren[j + 1].id;
						laoren[j].age = laoren[j + 1].age;
						laoren[j + 1].id = temp.id;
						laoren[j + 1].age = temp.age;
				   }
			   }
		  }
		  for (k = 0;k < amount_lao;k++)
		  {
			  System.out.println(laoren[k].id);
			  System.out.print("\n");
		  }
		  for (s = 0;s < amount_yiban;s++)
		  {
			  System.out.println(common[s].id);
			  System.out.print("\n");
		  }
		  System.in.read();
		  System.in.read();
	}

}

