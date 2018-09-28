package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l1;
		int l2;
		int l3;
		int e = 0;
		int sum = 0;
		String s = new String(new char[300]);
		String z = new String(new char[300]);
		String h = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			z = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
	//	scanf("%s",h);
		l2 = s.length();
		l1 = z.length();
	//	l3=strlen(h);
		for (i = 0;i <= l2 - l1;i++)
		{
			e = 0;
			for (j = 0;j < l1;j++)
			{
				if (z.charAt(j) == s.charAt(j + i))
				{
				  e++;
				}

			}

			if (e == l1)
			{
				System.out.printf("%d",i);
				sum++;
				break;

			/*	for (j=0;j<i;j++)
				{
				  printf("%c",s[j]);
				}
				for (j=0;j<l3;j++)
				{
				   printf ("%c",h[j]);
				}
				if (i+l2<l1-1)
				{
					for (j=i+l2;j<l1;k++)
					{
				       printf("%c",s[j]);
					}
				}
				sum++;
			   break;
			}
		}
		if(sum==0)
		{
		  for (i=0;i<l1;i++)
		  {
			 printf("%c",s[i]);
		  }
		}
	
	*/
			}
		}
		if (sum == 0)
		{
			System.out.print(" ");
		}
		return 0;
	}

}

