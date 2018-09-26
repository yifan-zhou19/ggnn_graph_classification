public class old
{
	public String ID = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		old[] a = tangible.Arrays.initializeWithDefaultoldInstances(100);
		old[] b = tangible.Arrays.initializeWithDefaultoldInstances(100);
		old[] c = tangible.Arrays.initializeWithDefaultoldInstances(100);
		int n;
		int i;
		int j;
		int B = 0;
		int C = 0;
		int temp;
		String TEMP = new String(new char[10]);
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
				a[i].ID = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].age = Integer.parseInt(tempVar3);
			}
			if (a[i].age >= 60)
			{
				b[B].ID = a[i].ID;
				b[B].age = a[i].age;
				B++;
			}
			else
			{
				c[C].ID = a[i].ID;
				c[C].age = a[i].age;
				C++;
			}
		}
		for (i = B - 1;i >= 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (b[j].age < b[j + 1].age || (b[j].age == b[j + 1].age && ((b[j].ID - '\0')>(b[j + 1].ID - '\0'))))
				{
					temp = b[j + 1].age,b[j + 1].age = b[j].age,b[j].age = temp;
					TEMP = b[j + 1].ID,strcpy(b[j + 1].ID,b[j].ID),strcpy(b[j].ID,TEMP);
				}
			}
		}
		for (i = C - 1;i >= 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if ((c[j].ID - '\0') > (c[j + 1].ID - '\0'))
				{
					temp = c[j + 1].age,c[j + 1].age = c[j].age,c[j].age = temp;
					TEMP = c[j + 1].ID,strcpy(c[j + 1].ID,c[j].ID),strcpy(c[j].ID,TEMP);
				}
			}
		}
		for (i = 0;i < B;i++)
		{
			System.out.printf("%s\n",b[i].ID);
		}
		for (i = 0;i < C;i++)
		{
			System.out.printf("%s\n",c[i].ID);
		}
	}

}

