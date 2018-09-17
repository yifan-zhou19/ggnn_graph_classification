package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		int[] b = new int[52];
		int i;
		int j;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (i = 0;;i++)
		{
			if (a.charAt(i) == '\0')
			{
				break;
			}
			else if (a.charAt(i) < 65 || a.charAt(i)>90 && a.charAt(i) < 97 || a.charAt(i)>122)
			{
				continue;
			}
			else if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
			{
				b[a.charAt(i) - 65]++;
			}
			else
			{
				b[a.charAt(i) - 97 + 26]++;
			}
		}
		for (j = 0;j <= 51;j++)
		{
		sum += b[j];
		}
		if (sum == 0)
		{
			System.out.print("No");
		}
		else
		{
		   for (i = 0;i <= 25;i++)
		   {
			 if (b[i] != 0)
			 {
			 System.out.printf("%c=%d\n",i + 65,b[i]);
			 }
		   }
			  for (i = 26;i <= 51;i++)
			  {
			   if (b[i] != 0)
			   {
			   System.out.printf("%c=%d\n",i + 97 - 26,b[i]);
			   }
			  }
		}

		return 0;
	}




}

