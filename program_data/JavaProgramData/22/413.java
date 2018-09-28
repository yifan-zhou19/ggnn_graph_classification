package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a[30000],i,j,k,l=0,m,temp;
		int[] a = new int[30000];
		int i;
		int j;
		int k;
		int l = 0;
		int m;
		int temp;
		String b = new String(new char[30000]);
		for (i = 0;i < 30000;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, tempVar2);
			}
			if (b.charAt(i) == ',')
			{
				continue;
			}
			else
			{
				break;
			}
		}
		if (i == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (j = 1;j <= i;j++)
			{
				if (a[j] == a[j - 1])
				{
					l++;
				}
			}
			if (l == i)
			{
				System.out.print("No");
			}
			else
			{
				for (j = 1;j <= i;j++)
				{
				for (k = 0;k <= i - j;k++)
				{
				if (a[k] < a[k + 1])
				{
					temp = a[k];
					a[k] = a[k + 1];
					a[k + 1] = temp;
				}
				}
				}
			  for (m = 1;m <= i;)

			  {

				  if (a[m - 1] > a[m])
				  {
					  System.out.printf("%d",a[m]);
					  break;
				  }
				  else
				  {
					  m++;
				  }
			  }
			}
		}
	}
}

