package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int length;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int p;
		int temp;
		String a = new String(new char[10005]);
		int[] b = new int[10005];
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		length = a.length();
		for (i = 0;i < length - n + 1;i++)
		{
		   if (b[i] != -1)
		   {
			   for (j = i + 1;j < length - n + 1;j++)
			   {
				 p = 0;
				 for (k = 0;k < n;k++)
				 {
					 if (a.charAt(i + k) != a.charAt(j + k))
					 {
						 p = 1;
						 break;
					 }
				 }
				if (p == 0)
				{
				   b[i]++;
				   b[j] = -1;
				  //printf("%d***%d\n",i,j);
				}
			   }
		   }
		}
		temp = 0;
		for (i = 0;i < length;i++)
		{
			if (b[i] > temp)
			{
			  temp = b[i];
			}
		}
		//printf("%d",temp);
		if (temp == 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",temp + 1);
		for (i = 0;i < length;i++)
		{
			if (b[i] == temp)
			{
			  for (k = 0;k < n;k++)
			  {
				  System.out.printf("%c",a.charAt(i + k));
			  }
			  System.out.print("\n");
			}
		}
		}
		return 0;

	}

}

