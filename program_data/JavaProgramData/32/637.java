public class num
{
   public String a = new String(new char[100]);
   public String b = new String(new char[100]);
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void f(char num1[100],char num2[100]);
		int n;
		int i;
		num[] num = tangible.Arrays.initializeWithDefaultnumInstances(10);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i].a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[i].b = tempVar3.charAt(0);
			}
			System.out.print("\n");
		}
		for (i = 0;i <= n - 1;i++)
		{
			f(num[i].a, num[i].b);
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	public static void f(String num1, String num2)
	{
		int n1;
		int n2;
		int j;
		int k;
		String c = new String(new char[100]);
		n1 = num1.length();
		n2 = num2.length();
		for (j = n1 - 1;j >= n1 - n2;j--)
		{
			if (num1[j].compareTo(num2[j - n1 + n2]) >= 0)
			{
				c = tangible.StringFunctions.changeCharacter(c, j, num1[j] - num2[j - n1 + n2].Substring(48));
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, j, num1[j] - num2[j - n1 + n2].Substring(58));
				num1[j - 1] = num1[j - 1] - 1;
			}
		}
		for (k = 0;k <= n1 - n2 - 1;k++)
		{
			c = tangible.StringFunctions.changeCharacter(c, k, num1[k]);
		}
		for (k = 0;k <= n1 - 1;k++)
		{
			System.out.printf("%c",c.charAt(k));
		}
	}



}

