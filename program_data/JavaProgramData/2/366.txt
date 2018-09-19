package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int amount_temp = 0;
		  int amount_most = 0;
		  char most;
		  char temp;
		  int i;
		  int j;
		  int k;
		  int s;
		  int p;
		  int m;
		  String jiancha = new String(new char[27]);
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	  struct xinxi
	//	  {
	//			 int bianhao;
	//			 char zuozhe[27];
	//	  };
		  xinxi[] shuru = tangible.Arrays.initializeWithDefaultxinxiInstances(999);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  for (p = 0;p < m;p++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  shuru[p].bianhao = tempVar2;
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  shuru[p].zuozhe = tempVar3;
			  }
		  }
		  for (temp = 'A';temp <= 'Z';temp++)
		  {
			  for (i = 0;i < m;i++)
			  {
				  jiancha = shuru[i].zuozhe;
				  for (j = 0;j < jiancha.length();j++)
				  {
					  if (jiancha.charAt(j) == temp)
					  {
						  amount_temp++;
					  }
				  }
			  }
			  if (amount_temp > amount_most)
			  {
				  amount_most = amount_temp;
				  most = temp;
				  amount_temp = 0;
			  }
			  else
			  {
				  amount_temp = 0;
			  }
		  }
		  System.out.printf("%c\n%d\n",most,amount_most);
		  for (i = 0;i < m;i++)
		  {
				  jiancha = shuru[i].zuozhe;
				  for (j = 0;j < jiancha.length();j++)
				  {
					  if (jiancha.charAt(j) == most)
					  {
						  System.out.printf("%d\n",shuru[i].bianhao);
						  break;
					  }
				  }
		  }
	}

}

