package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int i;
		int j;
		int l;
		int shang;
		i = 0;
		shang = 1;
		int[] zhuanhuan = new int[1000];
		int jieguo;
		if (num > 0)
		{
		   jieguo = 0;
		   shang = num;
		   while (shang != 0)
		   {
		   zhuanhuan[i] = shang % 10;
		   shang = shang / 10;
		   i++;
		   }
		   j = i;
		   for (i = 0;i < j;i++)
		   {
			  for (l = 0;l < i;l++)
			  {
				 zhuanhuan[j - i - 1] = zhuanhuan[j - i - 1] * 10;
			  }
			  jieguo = jieguo + zhuanhuan[j - i - 1];
		   }
		   return jieguo;
		}
		else if (num == 0)
		{
			jieguo = 0;
			return jieguo;
		}
		else
		{
		  jieguo = 0;
		   shang = 0 - num;
		   while (shang != 0)
		   {
		   zhuanhuan[i] = shang % 10;
		   shang = shang / 10;
		   i++;
		   }
		   j = i;
		   for (i = 0;i < j;i++)
		   {
			  for (l = 0;l < i;l++)
			  {
				 zhuanhuan[j - i - 1] = zhuanhuan[j - i - 1] * 10;
			  }
			  jieguo = jieguo + zhuanhuan[j - i - 1];
		   }

		   jieguo = 0 - jieguo;
		   return jieguo;
		}
	}

	public static int Main()
	{
	   int a;
	   int i;
	   int[] shuru = new int[6];
	   int[] jieguo = new int[6];


	   for (i = 0;i < 6;i++)
	   {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  shuru[i] = Integer.parseInt(tempVar);
		  }
	   }

	   for (i = 0;i < 6;i++)
	   {
		jieguo[i] = reverse(shuru[i]);
	   }

		for (i = 0;i < 6;i++)
		{
		  System.out.printf("%d\n",jieguo[i]);
		}

	   System.in.read();
	   System.in.read();

	}

}

