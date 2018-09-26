public class patient
{
	public String num = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] p = tangible.Arrays.initializeWithDefaultpatientInstances(100);

	public static void Main()
	{
		int i;
		int j = 0;
		int k = 0;
		int t;
		int l;
		int n;
		char[][] other = new char[100][10];
		String a = new String(new char[10]);
		patient[] old = tangible.Arrays.initializeWithDefaultpatientInstances(100);
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
			p[i].num = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p[i].age = Integer.parseInt(tempVar3);
		}
		}
	   for (i = 0;i < n;i++)
	   {
			if (p[i].age >= 60)
			{

			  old[j].num = p[i].num;
			  old[j].age = p[i].age;
			  j++;
			}
			else
			{
				other[k] = p[i].num;
				k++;
			}
	   }

		for (i = 0;i < j - 1;i++)
		{
			for (l = 0;l < j - 1 - i;l++)
			{
				if (old[l].age < old[l + 1].age)
				{
					t = old[l].age;
					old[l].age = old[l + 1].age;
					old[l + 1].age = t;

					a = old[l].num;
					old[l].num = old[l + 1].num;
					old[l + 1].num = a;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
		System.out.printf("%s\n",old[i].num);
		}
		for (i = 0;i < k;i++)
		{
		System.out.printf("%s\n",other[i]);
		}
	}

}

