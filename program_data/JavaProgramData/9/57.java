public class pat
{
	   public String num = new String(new char[10]);
	   public int age;
	   public int turn;
}

package <missing>;

public class GlobalMembers
{
	public static pat[] pa = tangible.Arrays.initializeWithDefaultpatInstances(100);
	public static pat temp = new pat();
	public static pat temp2 = new pat();

	public static int Main()
	{
		int i;
		int j;
		int t;
		int s;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 pa[i].num = tempVar2.charAt(0);
						 }
						 String tempVar3 = ConsoleInput.scanfRead(" ");
						 if (tempVar3 != null)
						 {
							 pa[i].age = Integer.parseInt(tempVar3);
						 }
						 pa[i].turn = i;
		}
		for (i = 1;i <= n;i++)
		{
						 if (pa[i].age >= 60)
						 {
										  for (j = 1;j <= i;j++)
										  {
														   if (pa[i].age > pa[j].age)
														   {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=pa[j];
																				  temp.copyFrom(pa[j]);
																				  pa[j] = pa[i];
																				  for (t = i - 1;t > j;t--)
																				  {
																							  pa[t + 1] = pa[t];
																				  }
																				  pa[j + 1] = temp;
																				  break;
														   }
										  }

						 }

		}
		for (i = 1;i <= n;i++)
		{



															System.out.println(pa[i].num);


		}

		return 0;
	}
}

