package <missing>;

public class GlobalMembers
{
	// change it according to the range required
	public static final int Size = 50001;

	public static int Main()
	{
	  short[] IsP = new short[Size];
	  int N;
	  int I;
	  int J;
	  N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (I = 1; I <= N; I++)
	  {
		  IsP[I] = 1;
	  }
	  IsP[2] = 1;
	  for (I = 2; I <= N; I++)
	  {
	  if (IsP[I] != 0)
	  {
		J = 2 * I;
		while (J <= N)
		{
		  IsP[J] = 0;
		  J += I;
		}
	  }
	  }
	  for (I = 6; I <= N; I += 2)
	  {
		for (J = 3; J <= I - 3; J++)
		{
		  if (IsP[J] != 0 && IsP[I - J] != 0)
		  {
		System.out.print(I);
		System.out.print("=");
		System.out.print(J);
		System.out.print("+");
		System.out.print((I - J));
		System.out.print("\n");
		break;
		  }
		}
	  }
	  return 0;
	}
}

