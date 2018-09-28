package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float std;
		float rate;
		float sign;
		int i;
		int l1;
		int l2;
		String dna1 = new String(new char[500]);
		String dna2 = new String(new char[500]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			std = Float.parseFloat(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			dna1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			dna2 = tempVar3.charAt(0);
		}
		l1 = dna1.length();
		l2 = dna2.length();
		sign = 0F;

		if (l1 != l2)
		{
				   System.out.print("error");
				   return 0;
		}

		for (i = 0;i < l1;i++)
		{
							  switch (dna1.charAt(i))
							  {
											  case'A':
											  break;
											  case'T':
											  break;
											  case'G':
											  break;
											  case'C':
											  break;
											  default:
												  System.out.print("error");
												  return 0;
							  }
							  switch (dna2.charAt(i))
							  {
											  case'A':
											  break;
											  case'T':
											  break;
											  case'G':
											  break;
											  case'C':
											  break;
											  default:
												  System.out.print("error");
												  return 0;
							  }
							  if (dna1.charAt(i) == dna2.charAt(i))
							  {
								  sign++;
							  }
		}
		rate = sign / l1;

		if (rate >= std)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}

		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			i = Integer.parseInt(tempVar4);
		}
		return 0;

	}
}

