package <missing>;

public class GlobalMembers
{
	// ???.cpp : ??????????????
	//



	public static int Main()
	{
		int i;
		int z;
		int s;
		for (i = 70;i >= 30;i -= 10)
		{
		   for (z = 20;z <= 30;z += 10)
		   {
			 for (s = 10;s < z && s <= 20;s += 10)
			 {
			   if (z * 2 + s < i && i - s < 60)
			   {
	System.out.printf("l %d\n",i - s);
	System.out.printf("q %d\n",i - z);
	System.out.printf("z %d\n",z);
	System.out.printf("s %d\n",s);



			   }
			 }
		   }
		}
		return 0;
	}
}
