import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

/**
 * 
 */

/**
 * @author fqayy
 *
 */
public class result_checker implements ActionListener {

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	private static boolean status;
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		game_page gp = new game_page();
		if (gp.cells_with_values() == 16) // meaning all cells are full
		{
				gp.set_error("\t\tHurrah! You WON!");
				status = true;
				for (int i=0;i<4;i++)
                {
                	for (int j=0;j<4;j++)
                	{
                		gp.cell[i][j].get_tf().setEditable(false);
                		 timer t = new timer();
                		 t.freeze_time(true);
                			
                    }
                }
			
		}
		else	
			gp.set_error("Game not Yet finished!");
		
	}
	public boolean isWon()
	{
		return status;
	}

}
