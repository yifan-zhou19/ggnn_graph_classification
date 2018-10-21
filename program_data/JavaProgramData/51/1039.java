package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] b = new int[500];
		int i;
		int j;
		int k;
		int max = 0;
		String a = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = tangible.StringFunctions.changeCharacter(a, 0, System.in.read());
		a = new Scanner(System.in).nextLine();
		for (k = 0;k < 500;k++)
		{
		  if (a.charAt(k) != '\0')
		  {
		  for (j = k + 1;j < 500;j++)
		  {
			if (a.charAt(j) != '\0')
			{
			  for (i = 0;i < n;i++)
			  {
				if (a.charAt(k + i) != a.charAt(j + i))
				{
					break;
				}
			  }
			  if (i == n)
			  {
				  b[k]++;
			  }
			}
			else
			{
				break;
			}
		  }
		  }
		  else
		  {
			  break;
		  }
		}
		for (i = 0;i < 500;i++)
		{
		  if (b[i] > max)
		  {
			  max = b[i];
		  }
		}
		if (max != 0)
		{
		System.out.printf("%d\n",max + 1);
		for (i = 0;i < 500;i++)
		{
		  if (b[i] == max)
		  {
		  for (j = 0;j < n;j++)
		  {
			System.out.printf("%c",a.charAt(i + j));
		  }
		  System.out.print("\n");
		  }
		}
		}
		else
		{
			System.out.print("NO\n");
		}
		//scanf("%d",&n);
		return 0;
	}


}

