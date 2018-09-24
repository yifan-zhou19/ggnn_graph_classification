package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int i = 1;
		int n;
		int x = 0;



		int[] f = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int isleapyear = int a;
		while (x <= 4)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c = Integer.parseInt(tempVar3);
			}
			n = 0;



			for (i = 1;i < b;i++)
			{


				n += f[i];
			}



			 n += c;
		   if (b > 2 && isleapyear(a) != 0)
		   {
				n += 1;
		   }

			System.out.printf("%d\n",n);
			x++;
		}

	}
	public static int isleapyear(int a)
	{
			return ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0));

	}
}

