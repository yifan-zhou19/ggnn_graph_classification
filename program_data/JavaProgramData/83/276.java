package <missing>;

public class GlobalMembers
{
	public static float kej(int fen)
	{
		if (fen >= 90 && fen <= 100)
		{
			return (4.0)F;
		}
		else if (fen >= 85 && fen <= 89)
		{
			return (3.7)F;
		}
		else if (fen >= 82 && fen <= 84)
		{
			return (3.3)F;
		}
		else if (fen >= 78 && fen <= 81)
		{
			return (3.0)F;
		}
		else if (fen >= 75 && fen <= 77)
		{
			return (2.7)F;
		}
		else if (fen >= 72 && fen <= 74)
		{
			return (2.3)F;
		}
		else if (fen >= 68 && fen <= 71)
		{
			return (2.0)F;
		}
		else if (fen >= 64 && fen <= 67)
		{
			return (1.5)F;
		}
		else if (fen >= 60 && fen <= 63)
		{
			return (1.0)F;
		}
		else
		{
			return (0)F;
		}
	}

	public static void Main()
	{
		  int i;
		  int n;
		  int xfen = 0;
		  int[] xf = new int[20];
		  int[] f = new int[20];
		  float[] xj = new float[20];
		  float zj = 0F;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  xf[i] = Integer.parseInt(tempVar2);
			  }
		  }
		  for (i = 0;i < n;i++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  f[i] = Integer.parseInt(tempVar3);
			  }
		  }

		  for (i = 0;i < n;i++)
		  {
			  xfen = xfen + xf[i];
		  }
		  for (i = 0;i < n;i++)
		  {
			  zj = zj + kej(f[i]) * xf[i];
		  }
		  zj = zj / xfen;
		  System.out.printf("%.2f",zj);

	}

}

