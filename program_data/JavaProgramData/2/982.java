public class book
{
		public String id = new String(new char[11]);
		public String name = new String(new char[30]);
}
public class au
{
	public int num;
	public char[][] id = new char[1000][11];
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		book b = new book();
		au[] a = tangible.Arrays.initializeWithDefaultauInstances(26);
		int n;
		int i;
		int j = 0;
		int k;
		char c;
		for (i = 0;i < 26;i++)
		{
			a[i].num = 0;
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
				b.id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b.name = tempVar3.charAt(0);
			}
			while (b.name.charAt(j) != '\0')
			{
				k = b.name.charAt(j) - 'A';
				a[k].id[a[k].num] = b.id;
				a[k].num++;
				j++;
			}
			j = 0;
		}
		k = 0;
		j = 0;
		for (i = 0;i < 26;i++)
		{
			j = (a[i].num > k)? i:j;
			k = (a[i].num > k)? a[i].num:k;
		}
		System.out.printf("%c\n",'A' + j);
		System.out.printf("%d\n",k);
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s\n",a[j].id[i]);
		}
	}
}

