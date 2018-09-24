package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int f(String a);
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int[] num1 = new int[52];
		int[] num2 = new int[52];
		int len1;
		int len2;
		int l;
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		len1 = a.length();
		len2 = b.length();
		for (i = 0;i <= len1 - 1;i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				l = a.charAt(i) - 97;
			}
			else if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				l = a.charAt(i) - 39;
			}
			num1[l]++;
		}

		for (i = 0;i <= len2 - 1;i++)
		{
			if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
			{
				m = b.charAt(i) - 97;
			}
			else if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
			{
				m = b.charAt(i) - 39;
			}
			num2[m]++;
		}
		i = 0;
		while (num1[i] == num2[i] && i <= 51)
		{
			i++;
		}
		if (i == 52)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}






















}

