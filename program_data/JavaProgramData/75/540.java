package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[10000]);
		String str2 = new String(new char[10000]);
		String temp = new String(new char[5]);
		int le1;
		int le2;
		int k = 0;
		int i;
		int m;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int[] c = new int[10000];
		int j;
		int max;
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		le1 = str1.length();
		le2 = str2.length();
		for (i = 0;i <= le1 - 1;i++)
		{
			if ((str1.charAt(i - 1) == ',' && i - 1 >= 0) || (i == 0))
			{
			   for (j = 0;j <= 4;j++)
			   {
				   if (str1.charAt(j + i) != ',')
				   {
					   temp = tangible.StringFunctions.changeCharacter(temp, j, str1.charAt(j + i));
				   }
				   if (str1.charAt(j + i) == ',')
				   {
					   break;
				   }
			   }
			   temp = tangible.StringFunctions.changeCharacter(temp, j, '\0');
			   a[k] = temp.charAt(0) - '0';
			   for (m = 1;m < temp.length();m++)
			   {
				   a[k] = 10 * a[k] + temp.charAt(m) - '0';
			   }
			   k++;
			}
		}
		k = 0;
		for (i = 0;i <= le2 - 1;i++)
		{
			if ((str2.charAt(i - 1) == ',' && i - 1 >= 0) || (i == 0))
			{
				for (j = 0;j <= 4;j++)
				{
					if (str2.charAt(j + i) != ',')
					{
						temp = tangible.StringFunctions.changeCharacter(temp, j, str2.charAt(j + i));
					}
					if (str2.charAt(j + i) == ',')
					{
						break;
					}
				}
				temp = tangible.StringFunctions.changeCharacter(temp, j, '\0');
				b[k] = temp.charAt(0) - '0';
				for (m = 1;m < temp.length();m++)
				{
					b[k] = 10 * b[k] + temp.charAt(m) - '0';
				}
				k++;
			}
		}
		System.out.print(k);
		System.out.print(" ");
		for (i = 0;i <= 1000;i++)
		{
		   for (j = 0;j <= k - 1;j++)
		   {
			   if (a[j] <= i != 0 && i < b[j])
			   {
				   c[i]++;
			   }
		   }
		}
		max = c[0];
		for (i = 0;i <= 1000;i++)
		{
			if (max < c[i])
			{
				max = c[i];
			}
		}
		System.out.print(max);
		return 0;
	}



}

