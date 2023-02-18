package ua.nure.your_last_name.SummaryTask4.web.command;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import ua.nure.your_last_name.SummaryTask4.Path;
import ua.nure.your_last_name.SummaryTask4.exception.AppException;

public class ConfirmCommand extends Command {

	private static final long serialVersionUID = 6786724595397852096L;

	private static final Logger LOG = Logger.getLogger(ConfirmCommand.class);

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, AppException {
		LOG.debug("Command starts");

		// Get checked orders IDs from request
		String[] checkedOrders = request.getParameterValues("checkedOrders");

		if (checkedOrders != null) {

			LOG.trace("Checked orders IDs: " + Arrays.toString(checkedOrders));

		}

		LOG.debug("Command finished");

		return Path.COMMAND_LIST_ORDERS;
	}

}
