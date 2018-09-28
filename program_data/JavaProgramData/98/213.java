public class word
{
	public String w = new String(new char[20]);
	public int a;
}

package <missing>;

public class GlobalMembers
{
	public static word[] word = tangible.Arrays.initializeWithDefaultwordInstances(1000);

	public static void Main(String[] args)
	{
		int i;
		int j;
		int n;
		int line;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		word * p = new word();
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=&word[0];
		p.copyFrom(word[0]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.w = tempVar2.charAt(0);
			}
			p.a = p.w.length();
			p++;
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=&word[0];
		p.copyFrom(word[0]);
		for (i = 1;i <= n;i++)
		{
			if (i == 1)
			{
				System.out.printf("%s",p.w);
				line = p.a;
				p++;
			}
			else if (line + p.a + 1 > 80)
			{
				System.out.printf("\n%s",p.w);
				line = p.a;
				p++;
			}
			else
			{
				System.out.printf(" %s",p.w);
				line += p.a + 1;
				p++;
			}
		}

	}

}

