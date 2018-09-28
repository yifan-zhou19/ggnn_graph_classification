package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void sort(char ch1[500],char ch2[500]);
		  String ch1 = new String(new char[500]);
		  String ch2 = new String(new char[500]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  ch1 = tempVar.charAt(0);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  ch2 = tempVar2.charAt(0);
		  }
		  int len1;
		  int len2;
		  len1 = ch1.length();
		  len2 = ch2.length();
		  if (len1 != len2)
		  {
			  System.out.print("NO");
		  }
		  else
		  {
			  sort(ch1, ch2);
		  }
	}
	public static void sort(String ch1, String ch2)
	{
		int k;
		int i;
		int j;
		int q;
		int[] b = new int[500];
		k = ch1.length();
		for (i = 0,q = 0;i < k;i++)
		{
			for (j = 0;j < k;j++)
			{
				if (b[j] == 0 && ch1[i].equals(ch2[j]))
				{
					b[j] = 1;
					q++;
					break;
				}
			}
		}
		if (q == k)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}

}

