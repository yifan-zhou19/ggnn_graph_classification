package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int mark;
		int flag;
		int len;
		int[] Len = new int[300];
		String sen = new String(new char[999]);

		i = 0;
		j = 0;
		k = 0;
		flag = 1;
		mark = 0;
		sen = new Scanner(System.in).nextLine();




		for (i = 0;i < 999;i++)
		{
		 if (sen.charAt(i) == ' ' && flag == 1)
		 {
		  flag = 0;
		  Len[j] = i - mark;
		  mark = i + 1;
		  j++;
		 }

		 else if (sen.charAt(i) == ' ' && flag == 0)
		 {
		   mark++;
		 }

		 else if (sen.charAt(i) != ' ' && sen.charAt(i) != '\0')
		 {
		  flag = 1;
		 }

		 else if (sen.charAt(i) == '\0')
		 {
		  Len[j] = i - mark;
		  break;
		 }
		}

		 for (k = 0;k < j;k++)
		 {
		  System.out.printf("%d,",Len[k]);
		 }
		 System.out.printf("%d",Len[j]);
	}


}
