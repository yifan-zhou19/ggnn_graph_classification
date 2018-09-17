package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float h;
		float e;
		float[] mh = new float[40];
		float[] fh = new float[40];
		int n;
		int i;
		int j;
		int am;
		int af;
		String xb = new String(new char[7]);
		am = 0;
		af = 0;
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
				xb = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h = Float.parseFloat(tempVar3);
			}
			if (xb.charAt(0) == 'm')
			{
				mh[am] = h;
				am = am + 1;
			}
			if (xb.charAt(0) == 'f')
			{
				fh[af] = h;
				af = af + 1;
			}
		}
		for (i = 1;i <= am;i++)
		{
			for (j = 0;j < am - i;j++)
			{
				if (mh[j] > mh[j + 1])
				{
					e = mh[j];
					mh[j] = mh[j + 1];
					mh[j + 1] = e;
				}
			}
		}
		for (i = 1;i <= af;i++)
		{
			for (j = af - 1;j > 0;j--)
			{
				if (fh[j] > fh[j - 1])
				{
					e = fh[j];
					fh[j] = fh[j - 1];
					fh[j - 1] = e;
				}
			}
		}
		for (i = 0;i < am;i++)
		{
			if (i == 0)
			{
				System.out.printf("%.2f",mh[i]);
			}
			else
			{
				System.out.printf(" %.2f",mh[i]);
			}
		}
		for (i = 0;i < af;i++)
		{
			System.out.printf(" %.2f",fh[i]);
		}
		return 0;
	}
}

