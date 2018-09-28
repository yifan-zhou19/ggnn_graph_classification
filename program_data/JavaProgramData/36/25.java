package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] count11 = new int[26];
		int[] count12 = new int[26];
		int[] count21 = new int[26];
		int[] count22 = new int[26];
		int length1;
		int length2;
		int i;
		int j;
		int k = 0;
		int p = 0;
		int m = 0;
		int n = 0;
		String string1 = new String(new char[100]);
		String string2 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			string1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			string2 = tempVar2.charAt(0);
		}
		length1 = string1.length();
		length2 = string2.length();
		for (i = 0;i < length1;i++)
		{
			if (string1.charAt(i) <= 'Z')
			{
			j = string1.charAt(i) - 65;
			count11[j]++;
			}
			else
			{
				j = string1.charAt(i) - 97;
				count12[j]++;
			}
		}
		for (i = 0;i < length2;i++)
		{
			if (string2.charAt(i) <= 'Z')
			{
			j = string2.charAt(i) - 65;
			count21[j]++;
			}
			else
			{
				j = string2.charAt(i) - 97;
				count22[j]++;
			}
		}
		while (count11[k] == count21[p])
		{
			k++;
			p++;
		}
			if (k != 26)
			{
				System.out.print("NO\n");
			}
			else if (k == 26)
			{
				while (count12[m] == count22[n] && m <= 25)
				{
					m = m + 1;
					n = n + 1;
				}
			if (m == 26)
			{
				System.out.print("YES\n");
			}
				else
				{
					System.out.print("NO\n");
				}
			}
	}
}

