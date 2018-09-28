package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void minus(char n1[100],char n2[100]);
		String num1 = new String(new char[100]);
		String num2 = new String(new char[100]);
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num2 = tempVar3.charAt(0);
			}
			minus(num1, num2);
			System.out.printf("%s\n",num1);
		}
	}
	public static void minus(String n1, String n2)
	{
		int a;
		int b;
		int k;
		a = n1.length();
		b = n2.length();
		for (k = b - 1;k >= 0;k--)
		{
			if (n1[a - b + k].compareTo(n2[k]) >= 0)
			{
				n1[a - b + k] = n1[a - b + k] - n2[k].Substring(48);
			}
			else
			{
				n1[a - b + k - 1]--;
				n1[a - b + k] = n1[a - b + k] - n2[k].Substring(58);
			}
		}
	}

}

