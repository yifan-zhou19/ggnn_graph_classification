package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n1;
		int n2;
		int p = 1;
		int len1;
		int len2;
		String str1 = new String(new char[80]); //?????????
		String str2 = new String(new char[80]);
		cin.get(str1,80);
		len1 = str1.length();
		System.in.read(); //??????????
		cin.get(str2,80);
		len2 = str2.length();
		for (i = 0;i < len1 || i < len2;i++)
		{
			n1 = str1.charAt(i);
			n2 = str2.charAt(i);
			if (n1 == n2 || n1 == (n2 + 32) || n2 == (n1 + 32)) //????????????????
			{
				p = 1;
			}
			else
			{
				p = 0;
				break;
			}
		}
		if (p == 1)
		{
			System.out.print("=");
			System.out.print("\n");
		}
		else
		{
			if (n1 < 'a')
			{
				n1 = n1 + 32;
			}
			if (n2 < 'a')
			{
				n2 = n2 + 32;
			}
			if (n1 < n2)
			{
				System.out.print("<");
				System.out.print("\n");
			}
			else
			{
			System.out.print(">");
			System.out.print("\n");
			}
		}
		return 0;
	}



}
