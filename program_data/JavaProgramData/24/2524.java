package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int start = 0;
		int max_start;
		int max_end;
		int min_start;
		int min_end;
		int max_len = -1;
		int min_len = 100;
		int cur_len;
		int len;
		int n;
		int end;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String input = new String(new char[1000]);
		input = new Scanner(System.in).nextLine();
		len = input.length();
		for (;start < len;)
		{
			end = start;
			  while (end < len && input.charAt(end) != ' ')
			  {
				  end++;
			  }
			  cur_len = end - start;
			  if (max_len < cur_len)
			  {
				  max_start = start;
				   max_end = end;
				   max_len = cur_len;
			  }
			  if (min_len > cur_len)
			  {
				  min_start = start;
				 min_end = end;
				 min_len = cur_len;
			  }
			  start = end + 1;

		}
		for (i = max_start;i < max_end;i++)
		{
		System.out.printf("%c",input.charAt(i));
		}
		System.out.print("\n");
		for (i = min_start;i < min_end;i++)
		{
		System.out.printf("%c",input.charAt(i));
		}
		return 0;
	}

}

