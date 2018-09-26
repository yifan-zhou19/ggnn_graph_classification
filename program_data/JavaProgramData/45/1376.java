package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String word_0 = new String(new char[LEN]);
	  String word_1 = new String(new char[LEN]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  word_0 = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  word_1 = tempVar2.charAt(0);
	  }
	  int m;
	  int n;
	  int i;
	  int j;
	  int p = 0;
	  m = word_0.length();
	  n = word_1.length();
	  for (i = 0;i < n;i++)
	  {
		  if (word_0.charAt(0) == word_1.charAt(i))
		  {
			 for (j = 1;j < m;j++)
			 {
				 if (word_0.charAt(j) != word_1.charAt(i + j))
				 {
					break;
				 }
				 else
				 {
					p++;
				 }
			 }
		  }
		  if (p == (m - 1))
		  {
			 System.out.printf("%d",i);
			 break;
		  }
	  }
	  return 0;
	}

}

