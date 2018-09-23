package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int N;
	  int I;
	  int J;
	  int Count;
	  int[] Arr = new int[15];
	  while (true)
	  {
		N = 0;
		while (true)
		{
		  Arr[N] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  if (Arr[N] == -1)
		  {
			  return 0;
		  }
		  if (Arr[N] == 0)
		  {
			  break;
		  }
		  N++;
		}
		Count = 0;
		for (I = 0; I < N - 1 ; I++)
		{
		  for (J = I + 1; J < N; J++)
		  {
		if (Arr[I] == 2 * Arr[J] || Arr[J] == 2 * Arr[I])
		{
		  Count++;
		}
		  }
		}
		System.out.print(Count);
		System.out.print("\n");
	  }
	  return 0;
	}
}

