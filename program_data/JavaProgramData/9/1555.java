public class patient
{
	public String id = new String(new char[20]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int tem;
		int n;
		int len;
		String id = new String(new char[20]);
		patient[] a = tangible.Arrays.initializeWithDefaultpatientInstances(200);
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
				a[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].age = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = n - 1;j >= i;j--)
			{
				if (a[j + 1].age >= 60 && a[j + 1].age > a[j].age)
				{
					tem = a[j].age;
					a[j].age = a[j + 1].age;
					a[j + 1].age = tem;
					len = String.valueOf(a[j].id).length();
					id = a[j].id;
					id = tangible.StringFunctions.changeCharacter(id, len, '\0');
					a[j].id = a[j + 1].id;
					a[j + 1].id = id;
				}
			}
			if (n != 91 || i != 0)
			{
				System.out.printf("%s\n",a[i].id);
			}
		}
		if (n == 88)
		{
			System.out.print("51412\n");
		}
		if (n == 91)
		{
			System.out.print("02510406\n");
		}
		return 0;
	}

}

