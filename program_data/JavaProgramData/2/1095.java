public class book
{
		public int num;
		public String aut = new String(new char[20]);
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int t;
		int max = 0;
		String a = new String(new char[20]);
		int[] words = new int[26];
		book[] b = tangible.Arrays.initializeWithDefaultbookInstances(100);
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
			(b[i].num) = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(b[i].aut) = tempVar3.charAt(0);
		}
		}

		for (i = 0;i < n;i++)
		{
		for (j = 0;b[i].aut.charAt(j) != '\0';j++)
		{
			t = (int)b[i].aut.charAt(j) - 65;
			words[t]++;
		}
		}

		for (i = 0;i < 26;i++)
		{
		if (words[i] > max)
		{
		max = words[i];
		t = i;
		}
		}
		System.out.printf("%c\n%d\n",t + 65,max);

		for (i = 0;i < n;i++)
		{
		for (j = 0;b[i].aut.charAt(j) != '\0';j++)
		{
			if (b[i].aut.charAt(j) == (char)(t + 65))
			{
			System.out.printf("%d\n",b[i].num);
			}
		}
		}
	}

}

