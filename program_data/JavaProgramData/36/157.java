package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int i,s1[26]={0},s2[26]={0},temp=0;
		int i;
		int[] s1 = new int[26];
		int[] s2 = new int[26];
		int temp = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		if (a.length() != b.length())
		{
			System.out.print("NO");
		}
		else
		{
		for (i = 0;i < a.length();i++)
		{
			s1[a.charAt(i) - 'a']++;
			s2[b.charAt(i) - 'a']++;
		}
		for (i = 0;i < 26;i++)
		{
			if (s1[i] == s2[i])
			{
				temp++;
			}
		}
		if (temp == 26)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
		}
	}
}

