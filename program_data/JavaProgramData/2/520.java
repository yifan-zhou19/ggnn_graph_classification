public class book
{
	public int num1;
	public String au = new String(new char[27]);
}
public class author
{
	public char name;
	public int a;
	public int[] num2 = new int[1000];
}

package <missing>;

public class GlobalMembers
{
	public static book[] bk = tangible.Arrays.initializeWithDefaultbookInstances(1000);
	public static author[] aur = tangible.Arrays.initializeWithDefaultauthorInstances(27);
	public static int Main()
	{
		int n;
		int i;
		int j;
		author max = new author();
		max.a = 0;

		for (j = 0;j < 26;j++)
		{
			aur[j].name = 65 + j;
			aur[j].a = 0;
		}
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
				bk[i].num1 = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				bk[i].au = tempVar3.charAt(0);
			}
		}
		//??????,?????
		for (i = 0;i < n;i++)
		{
			for (j = 0;bk[i].au.charAt(j) != '\0';j++)
			{
				aur[bk[i].au.charAt(j) - 65].num2[aur[bk[i].au.charAt(j) - 65].a] = bk[i].num1;
				aur[bk[i].au.charAt(j) - 65].a++;
			}
		}
		//??????????
		for (i = 0;i < 26;i++)
		{
			if (aur[i].a > max.a)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: max=aur[i];
				max.copyFrom(aur[i]);
			}
		}
		System.out.printf("%c\n%d\n",max.name,max.a);
		for (i = 0;i < max.a;i++)
		{
			System.out.printf("%d\n",max.num2[i]);
		}
		return 0;
	}

}

