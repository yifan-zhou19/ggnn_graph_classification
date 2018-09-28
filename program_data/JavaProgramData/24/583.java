package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[500]);
	 int i;
	 int[] t = new int[500];
	 int j = 1;
	 int jz;
	 t[0] = -1;
	 s = new Scanner(System.in).nextLine();
	 int m = s.length();
	 s = tangible.StringFunctions.changeCharacter(s, m, ' ');
	 for (i = 0;i <= m;i++)
	 {
	  if (s.charAt(i) == ' ' || s.charAt(i) == '\0')
	  {
		  t[j] = i;
		  j++;
		  jz = j;
	  }
	 }
		int k;
		int[] l = new int[20];
		for (k = 1;k < jz;k++)
		{
			l[k] = t[k] - t[k - 1] - 1;
		}
	 int max = 0;
	 int min = 20;
	 int y1;
	 int y2;
		for (k = 1;k < jz;k++)
		{
			if (min > l[k])
			{
				min = l[k];
				y1 = k;
			}
		}
		 for (k = 1;k < jz;k++)
		 {
			 if (max < l[k])
			 {
				max = l[k];
				y2 = k;
			 }
		 }
		 for (i = t[y2] - l[y2]; i < t[y2]; i++)
		 {
			System.out.printf("%c",s.charAt(i));
		 }
		 System.out.print("\n");

		 for (i = t[y1] - l[y1]; i < t[y1]; i++)
		 {
			System.out.printf("%c",s.charAt(i));
		 }
		 System.out.print("\n");
	}
}

