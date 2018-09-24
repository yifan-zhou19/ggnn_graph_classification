package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int hash1[500]={0},hash2[500]={0};
	public static void count(tangible.RefObject<String> p, int[] t)
	{
		int i;
		int l = p.argValue.length();
		for (i = 0;i < l;i++)
		{
			t[p.argValue.charAt(i)]++;
		}
	}
	public static void Main()
	{
		int i;
		int f = 0;
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
	tangible.RefObject<String> tempRef_s1 = new tangible.RefObject<String>(s1);
		count(tempRef_s1, hash1);
		s1 = tempRef_s1.argValue;
	tangible.RefObject<String> tempRef_s2 = new tangible.RefObject<String>(s2);
		count(tempRef_s2, hash2);
		s2 = tempRef_s2.argValue;
		for (i = 0;i < 500;i++)
		{
			if (hash1[i] != hash2[i])
			{
				f = 1;
				break;
			}
		}
		if (f != 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.print("YES");
		}
	}
}

