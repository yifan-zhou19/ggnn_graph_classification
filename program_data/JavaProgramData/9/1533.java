public class pat
{
	public String ID = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		pat[] p = tangible.Arrays.initializeWithDefaultpatInstances(100);
		pat[] old = tangible.Arrays.initializeWithDefaultpatInstances(100);
		pat[] young = tangible.Arrays.initializeWithDefaultpatInstances(100);
		pat temp;

		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (pat)malloc(len);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].ID = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].age = Integer.parseInt(tempVar3);
			}
		}
		int k = 0;
		int j = 0;
		for (i = 0;i < n;i++)
		{
			if (p[i].age >= 60)
			{
				old[k] = p[i];
				k++;
			}
			else
			{
				young[j] = p[i];
				j++;
			}
		}
		int lenold = k;
		int lenyoung = j;
		for (k = 1;k < lenold;k++)
		{
			for (i = 0;i < lenold - k;i++)
			{
				if (old[i].age < old[i + 1].age)
				{
					temp = old[i];
					old[i] = old[i + 1];
					old[i + 1] = temp;
				}
			}
		}
		for (i = 0;i < lenold;i++)
		{
			System.out.printf("%s\n",old[i].ID);
		}
		for (i = 0;i < lenyoung;i++)
		{
			System.out.printf("%s\n",young[i].ID);
		}

		return 0;

	}
}

