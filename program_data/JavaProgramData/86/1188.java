package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  int a0;
	  int t;
	  int i;
	  int j;
	  int n;
	  int m;

	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 0;i < n;i++)
	  {
		  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  t = 0;
		  a = 0;
		for (j = 0;j < m;j++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  t += 3; //time not jumping
		  a += t; //the time that has passed so far
		  if (a > 60)
		  {
			  break;
		  }
		}
		j++;
		while (j < m)
		{
			a0 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j++;
		}
		t = 60 - t;
		if (a > 60) //it's already over when stop counting
		{
		  switch (a)
		  {
			  case 61:
				  t++;
				  break;
			case 62:
				t += 2;
				break;
			default:
				t += 3; //count one more pausing round
		  }
		}
		System.out.print(t);
		System.out.print("\n");
	  }
	  return 0;
	}
}

