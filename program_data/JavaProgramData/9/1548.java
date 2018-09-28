public class pa
{ //patient
	public String id = new String(new char[10]);
	public int age;
	public int re; //register
}

package <missing>;

public class GlobalMembers
{
	public static pa[] p = tangible.Arrays.initializeWithDefaultpaInstances(100);
	public static pa[] po = tangible.Arrays.initializeWithDefaultpaInstances(100);
	public static pa temp = new pa();
	public static void Main()
	{
		int n;
		int i;
		int j;
		int pj = 0;
		int oldj = 0;
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
				p[pj].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[pj].age = Integer.parseInt(tempVar3);
			}
			if (p[pj].age >= 60)
			{
				po[oldj] = p[pj];
				po[oldj].re = oldj;
				oldj++;
			}
			else
			{
				p[pj].re = pj;
				pj++;
			}
		}
		for (i = 0;i < oldj - 1;i++)
		{
			for (j = i + 1;j < oldj;j++)
			{
				if ((po[i].age < po[j].age) || (po[i].age == po[j].age && po[i].re> po[j].re))
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=po[i];
					temp.copyFrom(po[i]);
					po[i] = po[j];
					po[j] = temp;
				}
			}
			System.out.printf("%s\n",po[i].id);
		}
		System.out.printf("%s\n",po[i].id);
		for (i = 0;i < pj;i++)
		{
			System.out.printf("%s\n",p[i].id);
		}
	}
}

