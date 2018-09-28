package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int a;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  int[] q = new int[n];
	  int[] score = new int[n];
	float[] gpa = new float[n];
	float avr;
	float sum = 0F;
	float psum = 0F;
	  for (int i = 0;i < n;i++)
	  {
	   q[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	   for (int i = 0;i < n;i++)
	   {
		score[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	  for (int i = 0;i < n;i++)
	  {
	a = score[i];
	if (a >= 90)
	{
	gpa[i] = 4.0 * q[i];
	}
	else if (a >= 85)
	{
	gpa[i] = 3.7 * q[i];
	}
	else if (a >= 82)
	{
	gpa[i] = 3.3 * q[i];
	}
	else if (a >= 78)
	{
	gpa[i] = 3.0 * q[i];
	}
	else if (a >= 75)
	{
	gpa[i] = 2.7 * q[i];
	}
	else if (a >= 72)
	{
	gpa[i] = 2.3 * q[i];
	}
	else if (a >= 68)
	{
	gpa[i] = 2.0 * q[i];
	}
	else if (a >= 64)
	{
	gpa[i] = 1.5 * q[i];
	}
	else if (a >= 60)
	{
	gpa[i] = 1.0 * q[i];
	}
	else
	{
	gpa[i] = 0F;
	}
	  }
	for (int i = 0;i < n;i++)
	{
	sum += gpa[i];
	psum += q[i];
	}
	avr = sum / psum;
	System.out.printf("%.2f",avr);
	}

}

