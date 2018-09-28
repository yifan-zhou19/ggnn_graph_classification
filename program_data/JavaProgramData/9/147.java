public class pat
{
	  public String num = new String(new char[10]);
	  public int age;
}

package <missing>;

public class GlobalMembers
{
	public static pat[] pat = tangible.Arrays.initializeWithDefaultpatInstances(100);
	public static pat[] str = tangible.Arrays.initializeWithDefaultpatInstances(100);
	public static pat t = new pat();
	public static int Main()
	{

		int n;
		int i;
		int j;
		int a = -1;
		int temp;
		int[] ch = new int[100];
		String c = new String(new char[100]);
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
				pat[i].num = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pat[i].age = Integer.parseInt(tempVar3);
			}
			if (pat[i].age >= 60)
			{
				 a++;
				 str[a].num = pat[i].num;
				 str[a].age = pat[i].age;
			}
		}
		for (i = a;i >= 1;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (str[j].age < str[j + 1].age)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=str[j];
					t.copyFrom(str[j]);
					str[j] = str[j + 1];
					str[j + 1] = t;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (pat[i].age < 60)
			{
				a++;
				str[a] = pat[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",str[i].num);
		}
	}

}

