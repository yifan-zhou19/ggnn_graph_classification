package <missing>;

public class GlobalMembers
{
	public static void read_words(String[] words, int n)
	{
	  int i;
	  for (i = 0; i < n; i++)
	  {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			words[i] = tempVar;
		}
	  }
	}

	public static int split_lines(String[] words, int[] lines, int n)
	{
	  int i = 0;
	  int j = 0;
	  lines[j] = 0;
	  while (i < n)
	  {
		int len = words[i].length();
		while (len <= MAX_LINE)
		{
		  i++;
		  if (i < n)
		  {
			len += 1 + words[i].length();
		  }
		  else
		  {
			  break;
		  }
		}
		j++;
		lines[j] = i;
	  }
	  return j;
	}

	public static void print_words(String[] words, int[] lines, int line_num)
	{
	  int i;
	  int e;
	  int k;
	  for (k = 0; k < line_num; k++)
	  {
		e = lines[k + 1] - 1;
		for (i = lines[k]; i < e; i++)
		{
		  System.out.printf("%s ", words[i]);
		}
		System.out.printf("%s\n", words[e]);
	  }
	}

	public static int Main()
	{
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  char[][] words = new char[n][WSIZE];
	  read_words(words, n);
	  int[] lines = new int[n];
	  int line_num = split_lines(words, lines, n);
	  print_words(words, lines, line_num);
	  return 0;
	}
}

