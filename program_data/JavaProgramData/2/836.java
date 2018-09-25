public class book
{
	public int code;
	public String writer = new String(new char[10]);
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int t = 0;
		int d;
		int[] ww = new int[27];
		char max;
		String w = new String(new char[27]);
		book[] list = tangible.Arrays.initializeWithDefaultbookInstances(999);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 26;i++)
		{
			w = tangible.StringFunctions.changeCharacter(w, i, i + 65);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				list[i].code = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				list[i].writer = tempVar3.charAt(0);
			}
		}
	   for (i = 0;i < n;i++)
	   {
		   for (j = 0;list[i].writer.charAt(j) != '\0';j++)
		   {
			   for (d = 0;d < 26;d++)
			   {
				   if (list[i].writer.charAt(j) == w.charAt(d))
				   {
					   ww[d]++;
				   }
			   }
		   }
	   }
		   max = ww[0];
		for (i = 0;i < 26;i++)
		{
		if (ww[i] > max)
		{
			max = ww[i];
			t = i;
		}
		}
		System.out.printf("%c\n%d\n",w.charAt(t),ww[t]);

	for (i = 0;i < n;i++)
	{
		   for (j = 0;list[i].writer.charAt(j) != '\0';j++)
		   {

				   if (list[i].writer.charAt(j) == w.charAt(t))
				   {
					   System.out.printf("%d\n",list[i].code);
				   }
		   }
	}
	}
}

